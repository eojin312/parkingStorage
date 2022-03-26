package marsparkdream.parkingstorage.Model;

import lombok.Data;

import java.io.Serializable;

@Data
public class ParkingDto implements Serializable {
    private final Long id;
    private final String parking;
}
