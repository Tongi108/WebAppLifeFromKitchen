package pl.lifefromkitchen.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;
import pl.lifefromkitchen.domain.DeliveryAddress;

import java.util.Set;

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

    @Column(name = "name", unique = true)
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


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "producer")
    Set<OrderHeaderEntity> orderHeaders;

    @ManyToMany
    @JoinTable(
            name = "producer_delivery_address",
            joinColumns = @JoinColumn(name = "producer_id"),
            inverseJoinColumns = @JoinColumn(name = "delivery_address_id")
    )
    private Set<DeliveryAddressEntity> deliveryAddresses;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "producer")
    private Set<MenuEntity> menus;
}
