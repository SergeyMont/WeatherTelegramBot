package ru.yandex.montovsergei.weathertelegrambot.webclient;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import ru.yandex.montovsergei.weathertelegrambot.config.WebClientConfiguration;

@SpringBootTest
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
class WebClientImplTest {
    private WebClientImpl webClient;

    @BeforeEach
    void WebClientInterfaceTest() {
        webClient = new WebClientImpl(new WebClientConfiguration().webClientWithTimeout());
    }


    @Test
    void getCurrentWeather() {
        System.out.println(webClient.getCurrentWeather("London").block());
    }

    @Test
    void getForecast() {
        System.out.println(webClient.getForecast("New York",3).block());
    }

}