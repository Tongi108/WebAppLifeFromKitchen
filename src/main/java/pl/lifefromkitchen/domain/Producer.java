package pl.lifefromkitchen.domain;

import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
//@Entity
@Builder
//@Table
@AllArgsConstructor
@NoArgsConstructor
//@EqualsAndHashCode(of = "name")
//@ToString(of = {"producerId", "name", "city", "postalCode", "street", "email", "phoneNumber"})
public class Producer {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer producerId;


    private String name;

    private String city;

    private String postalCode;

    private String street;

    private String email;

    private String phoneNumber;
}
