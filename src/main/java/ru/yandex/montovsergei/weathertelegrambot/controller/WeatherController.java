package ru.yandex.montovsergei.weathertelegrambot.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.telegram.telegrambots.meta.api.objects.Update;
import ru.yandex.montovsergei.weathertelegrambot.telegram.WeatherTelegramBot;

@RestController
@AllArgsConstructor
public class WeatherController {
//    WeatherTelegramBot bot;
//    @GetMapping("/")
//    public void getWeather(@RequestBody Update update) {
//        bot.onUpdateReceived(update);
//    }
}
