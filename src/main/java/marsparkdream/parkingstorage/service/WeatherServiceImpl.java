package marsparkdream.parkingstorage.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import marsparkdream.parkingstorage.Model.dto.WeatherDto;
import marsparkdream.parkingstorage.annotation.Description;
import marsparkdream.parkingstorage.service.serviceInterface.WeatherService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
@Slf4j
@Description("날씨 Service - WebFlux 로 연동해보기~!")
public class WeatherServiceImpl implements WeatherService {

    @Value("${weather.url}")
    private String url;

    @Value("${weather.secretKey}")
    private String secretKey;

    private final RestTemplate restTemplate;


    @Override
    @Description("여기서 연동해볼거임 - Test 는 MockBean")
    public Mono<WeatherDto> getWeather() {
        return null;
    }
}
