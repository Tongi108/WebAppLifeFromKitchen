package pl.lifefromkitchen.domain;

import lombok.*;
import pl.lifefromkitchen.infrastructure.database.entity.MenuItemEntity;

import java.util.Set;

@With
@Value
@Builder
@EqualsAndHashCode(of = "menuId")
@ToString(of = {"menuId", "description"})
public class Menu {

    Integer menuId;
    String description;
    String menuImage;
    Producer producer;
    MenuCategory menuCategory;
    Set<MenuItem> menuOfItems;
}
