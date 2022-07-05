package marsparkdream.parkingstorage.service;

import marsparkdream.parkingstorage.Model.WeatherReq;
import marsparkdream.parkingstorage.Model.dto.HomeReq;
import marsparkdream.parkingstorage.Model.dto.WeatherDto;
import marsparkdream.parkingstorage.annotation.Description;
import marsparkdream.parkingstorage.dto.WeatherReqMockData;
import marsparkdream.parkingstorage.service.serviceInterface.WeatherService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
@Description("ExtendWith 가 있어야함")
class HomeServiceImplTest {

    @Test
    @DisplayName("getHome_with_mockData")
    public void getHome_with_mockData (@Mock WeatherService weatherService) {
        // given
        HomeServiceImpl homeService = new HomeServiceImpl(weatherService);

        WeatherDto.Coord coord = WeatherDto.Coord.builder()
                .lon(126.924)
                .lat(37.5007)
                .build();

        WeatherDto.Weather weather = WeatherDto.Weather.builder()
                .id(804)
                .main("Clouds")
                .description("overcast clouds")
                .icon("04n")
                .build();

        WeatherDto.Main main = WeatherDto.Main.builder()
                .temp(300)
                .feels_like(303.89)
                .temp_min(298.03)
                .temp_max(300.99)
                .pressure(1005)
                .humidity(73)
                .sea_level(1005)
                .grnd_level(1002)
                .build();

        WeatherDto.Wind wind = WeatherDto.Wind.builder()
                .speed(0.58)
                .deg(341)
                .gust(1.22)
                .build();

        WeatherDto.Clouds clouds = WeatherDto.Clouds.builder()
                .all(100)
                .build();

        WeatherDto.Sys sys = WeatherDto.Sys.builder()
                .type(1)
                .id(5509)
                .country("KR")
                .sunrise(1656879356)
                .sunset(1656932218)
                .build();
        WeatherDto build = WeatherDto.builder()
                .coord(coord)
                .weather(new ArrayList<>(List.of(weather)))
                .base("stations")
                .main(main)
                .visibility(10000)
                .wind(wind)
                .clouds(clouds)
                .dt(1656943859)
                .sys(sys)
                .timezone(32400)
                .id(183)
                .name("boramae")
                .cod(200)
                .build();
        // when
        Mockito
                .when(ArgumentMatchers.any())
                .thenReturn(build);

        WeatherDto weatherDto = weatherService.getWeather(WeatherReq
                .builder()
                .lon("1")
                .lat("1")
                .build());

        Assertions.assertEquals(126.924, weatherDto.getCoord().getLon());

        // then
        homeService.getHome(HomeReq.builder()
                .lat("1")
                .lon("1")
                .limit("1")
                .name("boramae")
                .build());

        assertNotNull(homeService);
    }
}
