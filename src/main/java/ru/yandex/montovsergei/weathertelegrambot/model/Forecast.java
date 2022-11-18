package ru.yandex.montovsergei.weathertelegrambot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.util.List;
@Data
@NoArgsConstructor

public class Forecast {
    List<DayWeather> dayWeatherList;
}
