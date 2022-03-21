package marsparkdream.parkingstorage.service.serviceInterface;

import marsparkdream.parkingstorage.Model.Parking;
import marsparkdream.parkingstorage.Model.dto.ParkingDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ParkingService {

    Parking parkingSave(ParkingDto parkingDto);

    List<Parking> findAll();
}
