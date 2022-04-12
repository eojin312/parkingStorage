package marsparkdream.parkingstorage.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import marsparkdream.parkingstorage.service.serviceInterface.WeatherService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@RequiredArgsConstructor
@Slf4j
public class WeatherServiceImpl implements WeatherService {

    @Value("${weather.url}")
    private String url;

    @Value("${weather.secretKey}")
    private String secretKey;

    private final WebClient webClient;

    private void create() {
        webClient.get()
                .uri(url + secretKey)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(String.class)
                .flux()
                .toStream();
    }

}
