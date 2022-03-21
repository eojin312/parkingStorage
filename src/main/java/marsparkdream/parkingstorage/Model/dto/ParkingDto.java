package marsparkdream.parkingstorage.Model.dto;

import lombok.*;
import marsparkdream.parkingstorage.Model.Parking;

import java.io.Serializable;

@Data
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder(builderMethodName = "parkingDtoBuilder")
public class ParkingDto implements Serializable {
    private Long id;
    private String parking;

    public Parking toEntity() {
        return Parking
                .parkingBuilder()
                .id(id)
                .parking(parking)
                .build();
    }
}
