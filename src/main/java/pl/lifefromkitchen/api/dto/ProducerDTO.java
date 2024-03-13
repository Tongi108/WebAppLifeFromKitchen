package pl.lifefromkitchen.api.dto;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class ProducerDTO {


    private String name;
    private String city;
    private String postalCode;
}
