package pl.lifefromkitchen.domain;

import lombok.*;
import pl.lifefromkitchen.infrastructure.database.entity.ProducerEntity;

import java.util.HashSet;
import java.util.Objects;
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

    public Set<Producer> getProducer() {
        return Objects.isNull(producers) ? new HashSet<>() : producers;
    }
}
