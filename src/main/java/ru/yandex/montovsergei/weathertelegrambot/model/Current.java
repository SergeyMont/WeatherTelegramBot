package ru.yandex.montovsergei.weathertelegrambot.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Current {
    @JsonProperty("temperature")
    int temperature;
    @JsonProperty("weather_code")
    int weatherCode;
    @JsonProperty("weather_descriptions")
    List<String> weatherDescriptions;
    @JsonProperty("wind_speed")
    int windSpeed;
    @JsonProperty("pressure")
    int pressure;
    @JsonProperty("feelslike")
    int feelsLike;
}
