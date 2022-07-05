package marsparkdream.parkingstorage.Model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import marsparkdream.parkingstorage.annotation.Description;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Description("홈화면에서 사용할 응답객체")
public class HomeResponse {

    private WeatherDto weatherDto;
    private String name;
    private String status;
    private String limit;

    @Setter
    private String condition;
}
