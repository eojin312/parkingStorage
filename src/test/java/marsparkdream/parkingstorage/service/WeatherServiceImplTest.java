package marsparkdream.parkingstorage.service;

import lombok.extern.slf4j.Slf4j;
import marsparkdream.parkingstorage.annotation.Description;
import marsparkdream.parkingstorage.service.serviceInterface.WeatherService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
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

    @RepeatedTest(value = 10, name = "{displayName}, {currentRepetition}/{totalRepetitions}")
    @Test
    @DisplayName("반복해서_테스트하기")
    public void 반복해서_테스트하기 (RepetitionInfo repetitionInfo) {
        // given
        weatherService.getWeather();

        // when
        // 몇 번 반복했는지 표시
        log.info("method for count : {} / total : {}", repetitionInfo.getCurrentRepetition(), repetitionInfo.getTotalRepetitions());
        // then
    }
}
