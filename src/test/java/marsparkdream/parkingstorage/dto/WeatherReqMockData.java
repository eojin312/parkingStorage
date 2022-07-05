package marsparkdream.parkingstorage.dto;

import marsparkdream.parkingstorage.Model.WeatherReq;

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
}
