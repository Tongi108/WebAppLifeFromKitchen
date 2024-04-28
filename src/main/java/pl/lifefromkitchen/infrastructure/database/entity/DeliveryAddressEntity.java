package pl.lifefromkitchen.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode(of = "deliveryAddressId")
@ToString(of = {"deliveryAddressId", "street", "city", "postalCode"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "delivery_address")
@Entity
public class DeliveryAddressEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "delivery_address_id")
    private Integer deliveryAddressId;

    @Column(name = "street")
    private String street;

    @Column(name = "city")
    private String city;

    @Column(name = "postal_code")
    private String postalCode;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "deliveryAddresses")
    private Set<ProducerEntity> producers;



}
