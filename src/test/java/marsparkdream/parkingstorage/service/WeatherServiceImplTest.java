package marsparkdream.parkingstorage.service;

import lombok.extern.slf4j.Slf4j;
import marsparkdream.parkingstorage.Model.WeatherReq;
import marsparkdream.parkingstorage.Model.dto.WeatherDto;
import marsparkdream.parkingstorage.annotation.Description;
import marsparkdream.parkingstorage.dto.WeatherReqMockData;
import marsparkdream.parkingstorage.service.serviceInterface.WeatherService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
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
        log.info("weather info : {}", weatherService.getWeather(WeatherReq.builder().build()));
    }

    @RepeatedTest(value = 10, name = "{displayName}, {currentRepetition}/{totalRepetitions}")
    @Test
    @DisplayName("반복해서_테스트하기")
    // lat
    // lon
    public void 반복해서_테스트하기 (RepetitionInfo repetitionInfo) {
        // given
        WeatherDto weather = weatherService.getWeather(WeatherReq
                .builder()
                .lat("37.50070294506123")
                .lon("126.92404986517386")
                .build()
        );

        // when
        // 몇 번 반복했는지 표시
        log.info("method for count : {} / total : {} / weather : {}", repetitionInfo.getCurrentRepetition(), repetitionInfo.getTotalRepetitions(), weather);

        Assertions.assertNotNull(weather, () -> "Null 일 수가 없음 / 어떤 지역이든 날씨가 존재하기 때문");
    }


    @Test
    @DisplayName("각_다른_값으로_반복하면서_테스트하기")
    @ParameterizedTest
    @ValueSource(classes = {WeatherReqMockData.class})
    public void 각_다른_값으로_반복하면서_테스트하기 () {
        // given

        // when

        // then
    }
}
