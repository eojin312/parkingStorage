package marsparkdream.parkingstorage.Model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "location")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder(builderClassName = "locationBuilder")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToOne
    @JoinColumn(name = "parkingId")
    private Parking parking;

    @Column(name = "detail")
    private String detail;
}