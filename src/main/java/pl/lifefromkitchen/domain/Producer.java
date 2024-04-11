package pl.lifefromkitchen.domain;

import lombok.*;
import pl.lifefromkitchen.infrastructure.database.entity.DeliveryAddressEntity;

import java.util.Set;


@With
@Value
@Builder
@EqualsAndHashCode(of = "email")
@ToString(of = {"producerId", "name", "city", "description", "postalCode", "street", "email", "phoneNumber"})
public class Producer {


    Integer producerId;
    String name;
    String city;
    String description;
    String producerImage;
    String postalCode;
    String street;
    String email;
    String phoneNumber;
    Set<OrderHeader> orderHeaders;
    Set<Menu> menus;
    Set<DeliveryAddress> deliveryAddresses;

}
