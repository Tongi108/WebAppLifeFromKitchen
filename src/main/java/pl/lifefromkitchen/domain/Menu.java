package pl.lifefromkitchen.domain;

import lombok.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@With
@Value
@Builder
@EqualsAndHashCode(of = "menuId")
@ToString(of = {"menuId", "description", "menuImage"})
public class Menu {

    Integer menuId;
    String description;
    String menuImage;
    Producer producer;
    MenuCategory menuCategory;
    Set<MenuItem> menuOfItems;

    public Set<MenuItem> getMenuOfItems() {
        return Objects.isNull(menuOfItems) ? new HashSet<>() : menuOfItems;
    }




}
