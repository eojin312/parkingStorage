package marsparkdream.parkingstorage.repository;

import marsparkdream.parkingstorage.Model.Parking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingRepository extends JpaRepository<Parking, Long> {
}