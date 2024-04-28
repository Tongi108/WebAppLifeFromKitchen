package pl.lifefromkitchen.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.lifefromkitchen.domain.MenuItem;

import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MenuItemCategoryDTO {

    Integer menuItemCategoryId;
    String name;
    Set<MenuItem> menuItems;
}
