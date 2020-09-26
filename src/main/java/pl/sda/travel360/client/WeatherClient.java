package pl.sda.travel360.client;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
@RequiredArgsConstructor
public class WeatherClient {

    private final RestTemplate restTemplate;

    private String apiUrl = "http://api.weatherapi.com";
    private String getTemperaturePath = "/v1/current.json";
    private String apiKey = "d8ff71348e7c42d6918182014200708";

    // http://api.weatherapi.com/v1/current.json?key=d8ff71348e7c42d6918182014200708&q=Czestochowa

    public String getTemperature(String city) {
        String url = apiUrl + getTemperaturePath + "?key=" + apiKey + "&q=" + city;
        GetWeatherResponse response = restTemplate.getForObject(url, GetWeatherResponse.class);

        return response.getCurrent().getTemperature();
    }
}
