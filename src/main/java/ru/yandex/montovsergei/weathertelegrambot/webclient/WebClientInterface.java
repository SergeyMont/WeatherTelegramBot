package ru.yandex.montovsergei.weathertelegrambot.webclient;

import reactor.core.publisher.Mono;
import ru.yandex.montovsergei.weathertelegrambot.model.WeatherResponse;

public interface WebClientInterface {
    Mono<WeatherResponse> getCurrentWeather(String location);
    Mono<WeatherResponse> getForecast(String location, int days);
}
