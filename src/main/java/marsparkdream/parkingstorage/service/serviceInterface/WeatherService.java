package marsparkdream.parkingstorage.service.serviceInterface;

import marsparkdream.parkingstorage.Model.WeatherReq;
import marsparkdream.parkingstorage.Model.dto.WeatherDto;

public interface WeatherService {

    WeatherDto getWeather(WeatherReq weatherReq);
}
