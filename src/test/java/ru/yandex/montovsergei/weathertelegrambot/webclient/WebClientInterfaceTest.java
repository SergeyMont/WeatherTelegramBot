package ru.yandex.montovsergei.weathertelegrambot.webclient;

import lombok.AllArgsConstructor;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.web.reactive.server.WebTestClient;
import ru.yandex.montovsergei.weathertelegrambot.config.WebClientConfiguration;

import static org.junit.jupiter.api.Assertions.*;
//@SpringBootTest
//@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
//class WebClientInterfaceTest {
//    @Autowired
//    private final WebClientInterface webClient;
//
//    WebClientInterfaceTest() {
//        webClient = new WebClientConfiguration().webClientWithTimeout();
//    }
////    @Autowired
////    private final WebClientConfiguration webClientConfiguration;
////    @BeforeEach
////    public void setWebClient(){
////        webClient=new WebClientImpl(webClientConfiguration.webClientWithTimeout());
////    }
//
//    @Test
//    void getCurrentWeather() {
//        System.out.println(webClient.getCurrentWeather("London").block());
//    }
//
//    @Test
//    void getForecast() {
//        System.out.println(webClient.getForecast("New York",3).block());
//    }
//}