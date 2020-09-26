package pl.sda.travel360.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class GetWeatherResponse {

    @JsonProperty("current")
    private WeatherCurrent current;

}
