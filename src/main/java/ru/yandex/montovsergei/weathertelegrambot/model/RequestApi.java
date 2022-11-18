package ru.yandex.montovsergei.weathertelegrambot.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RequestApi {
    @JsonProperty("type")
    String type;
    @JsonProperty("query")
    String query;
    @JsonProperty("language")
    String language;
    @JsonProperty("unit")
    String unit;

    @JsonCreator
    public RequestApi(@JsonProperty("type")
                      String type,
                      @JsonProperty("query")
                      String query,
                      @JsonProperty("language")
                      String language,
                      @JsonProperty("unit")
                          String unit) {
        this.type=type;
        this.query=query;
        this.language=language;
        this.unit=unit;
    }
}
