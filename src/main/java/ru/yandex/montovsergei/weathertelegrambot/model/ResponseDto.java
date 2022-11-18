package ru.yandex.montovsergei.weathertelegrambot.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class ResponseDto {
    String nameOfCity;
    String nameOfCountry;
    String localTime;
    int temperature;
    List<String> weatherDescription;
    int windSpeed;

    @Override
    public String toString() {
        return
                "NameOfCity= " + nameOfCity + '\n' +
                "NameOfCountry= " + nameOfCountry + '\n' +
                "LocalTime= " + localTime + '\n' +
                "Temperature= " + temperature + '\n' +
                "WeatherDescription= " + weatherDescription + '\n' +
                "WindSpeed= " + windSpeed ;
    }
}
