package pl.lifefromkitchen.domain;

import lombok.*;

import java.util.Set;

@With
@Value
@Builder
@EqualsAndHashCode(of = "email")
@ToString(of = {"customerId", "name", "surname", "phoneNumber", "email" })
public class Customer {

    Integer customerId;
    String name;
    String surname;
    String phoneNumber;
    String email;
    Address address;
    Set<OrderHeader> orderHeaders;
}

