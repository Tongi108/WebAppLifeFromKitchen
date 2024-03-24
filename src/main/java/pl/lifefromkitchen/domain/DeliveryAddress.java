package pl.lifefromkitchen.domain;

import lombok.*;
import pl.lifefromkitchen.infrastructure.database.entity.ProducerEntity;

import java.util.Set;

@With
@Value
@Builder
@EqualsAndHashCode(of = "deliveryAddressId")
@ToString(of = {"deliveryAddressId", "street", "city", "postalCode"})
public class DeliveryAddress {

    Integer deliveryAddressId;
    String street;
    String city;
    String postalCode;
    Set<Producer> producers;
}
