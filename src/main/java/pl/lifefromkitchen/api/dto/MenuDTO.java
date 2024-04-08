package pl.lifefromkitchen.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.lifefromkitchen.domain.MenuCategory;
import pl.lifefromkitchen.domain.Producer;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MenuDTO {


    String description;
    String menuImage;
    Producer producer;
    MenuCategory menuCategory;
}
