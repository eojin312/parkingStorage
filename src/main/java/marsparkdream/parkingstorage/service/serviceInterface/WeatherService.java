package marsparkdream.parkingstorage.service.serviceInterface;

import marsparkdream.parkingstorage.Model.dto.WeatherDto;
import reactor.core.publisher.Mono;

public interface WeatherService {

    WeatherDto getWeather();
}
