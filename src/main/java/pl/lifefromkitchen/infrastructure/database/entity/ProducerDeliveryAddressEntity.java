package pl.lifefromkitchen.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@EqualsAndHashCode(of = {"producer", "deliveryAddress"})
@ToString(of = {"producer", "deliveryAddress"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "producer_delivery_address")
@Entity
public class ProducerDeliveryAddressEntity {


    @Id
    @ManyToOne
    @JoinColumn(name = "producer_id")
    private ProducerEntity producer;

    @Id
    @ManyToOne
    @JoinColumn(name = "delivery_address_id")
    private DeliveryAddressEntity deliveryAddress;
}
