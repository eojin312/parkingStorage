package marsparkdream.parkingstorage.Model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "parking")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder(builderMethodName = "parkingBuilder")
public class Parking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    // 주차장 정보 (EX. 1층 / 1.5층 / 2층 ...)
    @Column(name = "parking", nullable = false)
    private String parking;
}