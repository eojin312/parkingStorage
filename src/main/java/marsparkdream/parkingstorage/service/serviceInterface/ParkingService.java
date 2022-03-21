package marsparkdream.parkingstorage.service.serviceInterface;

import marsparkdream.parkingstorage.Model.Parking;
import marsparkdream.parkingstorage.Model.dto.ParkingDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface ParkingService {

    Parking parkingSave(ParkingDto parkingDto);

    List<Parking> findAll();

    Optional<Parking> findById(Long parkingId);
}
