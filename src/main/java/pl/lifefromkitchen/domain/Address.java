package pl.lifefromkitchen.domain;

import lombok.*;

@With
@Value
@Builder
@EqualsAndHashCode(of = "addressId")
@ToString(of = {"addressId", "country", "city", "street", "postalCode"})
public class Address {
    Integer addressId;
    String country;
    String city;
    String street;
    String postalCode;

}
