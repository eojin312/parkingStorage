package marsparkdream.parkingstorage.service;

import lombok.extern.slf4j.Slf4j;
import marsparkdream.parkingstorage.annotation.Description;
import marsparkdream.parkingstorage.service.serviceInterface.WeatherService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Description("Weather Test")
@Slf4j
class WeatherServiceImplTest {

    @Autowired
    private WeatherService weatherService;

    @Test
    void getWeather() {
        log.info("weather info : {}", weatherService.getWeather());
    }
}
