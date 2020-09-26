package pl.sda.travel360.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class WeatherCurrent {

    @JsonProperty("temp_c")
    private String temperature;
}
