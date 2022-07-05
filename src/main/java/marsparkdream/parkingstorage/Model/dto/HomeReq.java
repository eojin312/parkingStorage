package marsparkdream.parkingstorage.Model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import marsparkdream.parkingstorage.annotation.Description;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Description("홈화면에서 사용할 요청객체")
public class HomeReq {
    private String name;
    private String status;
    private String limit;
    private String lat;
    private String lon;
}
