package marsparkdream.parkingstorage.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import marsparkdream.parkingstorage.Model.WeatherReq;
import marsparkdream.parkingstorage.Model.dto.HomeReq;
import marsparkdream.parkingstorage.Model.dto.HomeResponse;
import marsparkdream.parkingstorage.Model.dto.WeatherDto;
import marsparkdream.parkingstorage.service.serviceInterface.HomeService;
import marsparkdream.parkingstorage.service.serviceInterface.WeatherService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class HomeServiceImpl implements HomeService {

    private final WeatherService weatherService;


    @Override
    public HomeResponse getHome(HomeReq homeReq) {
        WeatherDto weather = weatherService.getWeather(WeatherReq.builder()
                .lat(homeReq.getLat())
                .lon(homeReq.getLon())
                .build());

        if (weather.getWeather().get(0).getMain().equals("Clouds")) {
            System.out.println("구름 꼈어요");
            HomeResponse.builder()
                    .condition("구름")
                    .build();
        } else {
            HomeResponse.builder()
                    .condition("화창하거나 비와요")
                    .build();
        }

        return HomeResponse.builder()
                .limit(homeReq.getLimit())
                .name(homeReq.getName())
                .status(homeReq.getStatus())
                .weatherDto(weather)
                .build();
    }
}
