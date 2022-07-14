package marsparkdream.parkingstorage.service;

import lombok.RequiredArgsConstructor;
import marsparkdream.parkingstorage.Model.Parking;
import marsparkdream.parkingstorage.Model.dto.ParkingDto;
import marsparkdream.parkingstorage.repository.ParkingRepository;
import marsparkdream.parkingstorage.service.serviceInterface.ParkingService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ParkingServiceImpl implements ParkingService {

    private final ParkingRepository parkingRepository;

    /**
     * 주차장 정보 등록/수정
     */
    public Parking parkingSave(ParkingDto parkingRequestDto) {
        return parkingRepository.save(parkingRequestDto.toEntity());
    }

    /**
     * 주차장 정보 전체
     */
    @Override
    public List<Parking> findAll() {
        return parkingRepository.findAll();
    }

    public Optional<Parking> findById(Long parkingId) {
        return parkingRepository.findById(parkingId);
    }
}
