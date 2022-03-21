package marsparkdream.parkingstorage.service;

import marsparkdream.parkingstorage.Model.dto.ParkingDto;
import marsparkdream.parkingstorage.service.serviceInterface.ParkingService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ParkingServiceImplTest {

    @Autowired
    private ParkingService parkingService;


    @Test
    void saveTest () {
        // given
        ParkingDto one = ParkingDto.parkingDtoBuilder().parking("지하1층").build();
        ParkingDto oneHalf = ParkingDto.parkingDtoBuilder().parking("지하1.5층").build();
        ParkingDto two = ParkingDto.parkingDtoBuilder().parking("지하2층").build();
        ParkingDto twoHalf = ParkingDto.parkingDtoBuilder().parking("지하2.5층").build();
        ParkingDto three = ParkingDto.parkingDtoBuilder().parking("지하3층").build();
        ParkingDto threeHalf = ParkingDto.parkingDtoBuilder().parking("지하3.5층").build();
        ParkingDto four = ParkingDto.parkingDtoBuilder().parking("지하4층").build();
        ParkingDto fourHalf = ParkingDto.parkingDtoBuilder().parking("지하4.5층").build();

        // when
        parkingService.parkingSave(one);
        parkingService.parkingSave(oneHalf);
        parkingService.parkingSave(two);
        parkingService.parkingSave(twoHalf);
        parkingService.parkingSave(three);
        parkingService.parkingSave(threeHalf);
        parkingService.parkingSave(four);
        parkingService.parkingSave(fourHalf);

        // then
        Assertions.assertEquals(8, parkingService.findAll().size());
    }

}