package ru.yandex.montovsergei.weathertelegrambot.webclient;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
@Service
@AllArgsConstructor
public class Client {
    private final WebClient webClient;
}
