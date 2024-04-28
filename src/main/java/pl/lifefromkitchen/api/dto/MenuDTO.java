package pl.lifefromkitchen.api.dto;

import lombok.*;
import pl.lifefromkitchen.domain.MenuCategory;
import pl.lifefromkitchen.domain.Producer;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MenuDTO {


    String name;
    String category;
    String description;
    String menuImage;
    BigDecimal price;




}
