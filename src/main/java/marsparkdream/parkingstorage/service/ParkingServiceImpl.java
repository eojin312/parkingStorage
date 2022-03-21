package marsparkdream.parkingstorage.service;

import lombok.RequiredArgsConstructor;
import marsparkdream.parkingstorage.Model.Parking;
import marsparkdream.parkingstorage.Model.dto.ParkingDto;
import marsparkdream.parkingstorage.repository.ParkingRepository;
import marsparkdream.parkingstorage.service.serviceInterface.ParkingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ParkingServiceImpl implements ParkingService {

    private final ParkingRepository parkingRepository;

    /**
     * 주차장 정보 등록/수정
     */
    public Parking parkingSave(ParkingDto parking) {
        return parkingRepository.save(parking.toEntity());
    }

    @Override
    public List<Parking> findAll() {
        return parkingRepository.findAll();
    }

    /**
     * 주차장 정보 전체
     */
}