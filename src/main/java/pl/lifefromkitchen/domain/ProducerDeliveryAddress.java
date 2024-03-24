package pl.lifefromkitchen.domain;

import lombok.*;

@With
@Value
@Builder
@EqualsAndHashCode(of = {"producer", "deliveryAddress"})
@ToString(of = {"producer", "deliveryAddress"})

public class ProducerDeliveryAddress {

    Producer producer;
    DeliveryAddress deliveryAddress;
}
