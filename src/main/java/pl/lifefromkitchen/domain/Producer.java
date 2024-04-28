package pl.lifefromkitchen.domain;

import lombok.*;

import java.util.HashSet;
import java.util.Objects;
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

    public Set<Menu> getMenus() {
        return Objects.isNull(menus) ? new HashSet<>() : menus;
    }

    public Set<DeliveryAddress> getDeliveryAddress() {
        return Objects.isNull(deliveryAddresses) ? new HashSet<>() : deliveryAddresses;
    }

    public Set<OrderHeader> getOrderHeaders() {
        return Objects.isNull(orderHeaders) ? new HashSet<>() : orderHeaders;
    }

}
