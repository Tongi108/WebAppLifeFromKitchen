package pl.lifefromkitchen.domain;

import lombok.*;

import java.util.Set;

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
    Customer customer;


}
