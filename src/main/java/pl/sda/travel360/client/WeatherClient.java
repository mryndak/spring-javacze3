package pl.sda.travel360.client;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
@RequiredArgsConstructor
public class WeatherClient {

    private final RestTemplate restTemplate;

    @Value("${app.weather-client.api-url}")
    private String apiUrl;
    @Value("${app.weather-client.temperature-path}")
    private String getTemperaturePath;
    @Value("${app.weather-client.api-key}")
    private String apiKey;

    public String getTemperature(String city) {
        String url = apiUrl + getTemperaturePath + "?key=" + apiKey + "&q=" + city;
        GetWeatherResponse response = restTemplate.getForObject(url, GetWeatherResponse.class);

        return response.getCurrent().getTemperature();
    }
}
