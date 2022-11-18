package ru.yandex.montovsergei.weathertelegrambot.model;

import java.time.format.DateTimeFormatter;

public class Mapper {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static ResponseDto toResponseDto(WeatherResponse response){
        ResponseDto responseDto = new ResponseDto(response.getLocation().getName(),
                response.getLocation().getCountry(),
                response.getLocation().getLocalTime().format(formatter),
                response.getCurrent().getTemperature(),
                response.getCurrent().getWeatherDescriptions(),
                response.getCurrent().getWindSpeed());
        return responseDto;
    }
}
