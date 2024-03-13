package pl.lifefromkitchen.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@EqualsAndHashCode(of = "producerId")
@ToString(of = {"producerId", "city", "name", "postalCode", "street", "email", "phoneNumber"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "producer")
@Entity
public class ProducerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "producer_id")
    private Integer producerId;

    @Column(name = "name")
    private String name;

    @Column(name = "city")
    private String city;

    @Column(name = "postal_code")
    private String postalCode;

    @Column(name = "street")
    private String street;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;
}
