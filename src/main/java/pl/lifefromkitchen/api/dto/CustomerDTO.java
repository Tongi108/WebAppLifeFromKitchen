package pl.lifefromkitchen.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.lifefromkitchen.domain.Address;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {

    String name;
    String surname;
    String phoneNumber;
    String email;
    Address address;
}
