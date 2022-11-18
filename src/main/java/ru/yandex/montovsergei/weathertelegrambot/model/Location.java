package ru.yandex.montovsergei.weathertelegrambot.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Location {
    @JsonProperty("name")
    String name;
    @JsonProperty("country")
    String country;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    @JsonProperty("localtime")
    LocalDateTime localTime;
}
