package pl.lifefromkitchen.domain;

import lombok.*;

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
}
