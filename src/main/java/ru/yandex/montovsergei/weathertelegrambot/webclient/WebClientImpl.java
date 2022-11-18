package ru.yandex.montovsergei.weathertelegrambot.webclient;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import ru.yandex.montovsergei.weathertelegrambot.model.WeatherResponse;

@Service
public class WebClientImpl implements WebClientInterface{
    private final WebClient webClient;
    private static final String ACCESS="0ad64cfaf24a3f8990c9e0be055754e7";

    public WebClientImpl(WebClient webClient) {
        this.webClient = webClient;
    }

    @Override
    public Mono<WeatherResponse> getCurrentWeather(String location) {
        return webClient.get()
                .uri("/current?access_key="+ACCESS+"&query="+location)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve().bodyToMono(WeatherResponse.class);
    }

    @Override
    public Mono<WeatherResponse> getForecast(String location, int days) {
        return webClient.get()
                .uri("/forecast?access_key="+ACCESS+"&query="+location+"&forecast_days="+days)
                .retrieve().bodyToMono(WeatherResponse.class);
    }
}
