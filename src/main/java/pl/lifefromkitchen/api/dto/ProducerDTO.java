package pl.lifefromkitchen.api.dto;

import lombok.*;
import pl.lifefromkitchen.domain.Menu;

import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class ProducerDTO {


    private Integer producerId;
    private String name;
    private String city;
    private String description;
    private String producerImage;
    private String postalCode;
    private Set<Menu> menus;
}
