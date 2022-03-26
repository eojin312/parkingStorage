package marsparkdream.parkingstorage.Model.dto;

import lombok.Data;
import marsparkdream.parkingstorage.Model.ParkingDto;

import java.io.Serializable;

@Data
public class LocationDto implements Serializable {
    private final Long id;
    private final ParkingDto parking;
    private final String detail;
}
