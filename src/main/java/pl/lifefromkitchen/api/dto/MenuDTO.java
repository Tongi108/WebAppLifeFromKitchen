package pl.lifefromkitchen.api.dto;

import lombok.*;
import pl.lifefromkitchen.domain.MenuCategory;
import pl.lifefromkitchen.domain.Producer;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MenuDTO {


    String description;
    String menuImage;




}
