package ru.yandex.montovsergei.weathertelegrambot.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor

public class DayWeather {
    @JsonProperty("date")
    LocalDate date;
    @JsonProperty("mintemp")
    int minTemp;
    @JsonProperty("maxtemp")
    int maxTemp;
    @JsonProperty("avgtemp")
    int avgTemp;
}
