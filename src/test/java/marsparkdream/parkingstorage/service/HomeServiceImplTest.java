package marsparkdream.parkingstorage.service;

import marsparkdream.parkingstorage.annotation.Description;
import marsparkdream.parkingstorage.service.serviceInterface.WeatherService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
@Description("ExtendWith 가 있어야함")
class HomeServiceImplTest {

    @Test
    @DisplayName("getHome_with_mockData")
    public void getHome_with_mockData (@Mock WeatherService weatherService) {
        // given
        HomeServiceImpl homeService = new HomeServiceImpl(weatherService);
        // when

        // then
        assertNotNull(homeService);

    }
}
