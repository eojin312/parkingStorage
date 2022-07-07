package marsparkdream.parkingstorage.service;

import marsparkdream.parkingstorage.Model.dto.HomeReq;
import marsparkdream.parkingstorage.annotation.Description;
import marsparkdream.parkingstorage.dto.WeatherReqMockData;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
@Description("ExtendWith 가 있어야함")
class HomeServiceImplTest {

    @Test
    public void getHome_with_mockData (@Mock WeatherServiceImpl weatherService) {
        // given
        HomeServiceImpl homeService = new HomeServiceImpl(weatherService);

        // when
        Mockito
                .when(ArgumentMatchers.any())
                .thenReturn(WeatherReqMockData.local());

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
