package marsparkdream.parkingstorage.dto;

import marsparkdream.parkingstorage.Model.WeatherReq;
import marsparkdream.parkingstorage.Model.dto.WeatherDto;

import java.util.ArrayList;
import java.util.List;

public class WeatherReqMockData {

    public static WeatherReq seoul() {
        return WeatherReq
                .builder()
                .lat("37.50070294506123")
                .lon("126.92404986517386")
                .build();
    }

    public static WeatherReq newYork() {
        return WeatherReq
                .builder()
                .lat("43.000000")
                .lon("-75.000000")
                .build();
    }

    public static WeatherReq texas() {
        return WeatherReq
                .builder()
                .lat("31.000000")
                .lon("-100.000000")
                .build();
    }

    public static WeatherDto local() {
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

        return WeatherDto.builder()
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
    }
}
