package ru.yandex.montovsergei.weathertelegrambot.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Value
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WeatherResponse {
    @JsonProperty("request")
    RequestApi request;
    @JsonProperty("location")
    Location location;
    @JsonProperty("current")
    Current current;
    @JsonProperty("forecast")
    Forecast forecast;

    @JsonCreator
    public WeatherResponse(
            @JsonProperty("request")
            RequestApi request,
            @JsonProperty("location")
            Location location,
            @JsonProperty("current")
            Current current,
            @JsonProperty("forecast")
            Forecast forecast
    ) {
        this.request = request;
        this.location = location;
        this.current = current;
        this.forecast = forecast;
    }
}
