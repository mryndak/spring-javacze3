package pl.sda.travel360.client;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class WeatherClientTest {

    @Autowired
    private WeatherClient weatherClient;

    @Test
    void getTemperature() {
        // given
        String city = "Czestochowa";
        // when
        String temperature = weatherClient.getTemperature(city);
        // then
        assertNotNull(temperature);
        System.out.println(temperature);
    }
}