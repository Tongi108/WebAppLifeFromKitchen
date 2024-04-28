package pl.lifefromkitchen.api.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerAddressDTO {

    String country;
    String city;
    String street;
    String postalCode;
}
