package marsparkdream.parkingstorage.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import marsparkdream.parkingstorage.annotation.Description;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Description("내가 알고싶은 지역의 날씨정보를 알기 위한 Request")
public class WeatherReq {

    @Description("latitude")
    private String lat;

    @Description("longitude")
    private String lon;
}
