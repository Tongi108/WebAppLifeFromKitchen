package pl.lifefromkitchen.domain;

import lombok.*;

import java.util.Set;


@With
@Value
@Builder
@EqualsAndHashCode(of = "email")
@ToString(of = {"producerId", "name", "city", "postalCode", "street", "email", "phoneNumber"})
public class Producer {


    Integer producerId;
    String name;
    String city;
    String postalCode;
    String street;
    String email;
    String phoneNumber;
    Set<OrderHeader> orderHeaders;
    Set<Menu> menus;
    //brakuje producerDeliveryAddress
    // brakuje deliveryAddress
}
