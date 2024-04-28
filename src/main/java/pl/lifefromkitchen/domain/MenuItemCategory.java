package pl.lifefromkitchen.domain;

import lombok.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@With
@Value
@Builder
@EqualsAndHashCode(of = "menuItemCategoryId")
@ToString(of = {"menuItemCategoryId", "name"})
public class MenuItemCategory {


    Integer menuItemCategoryId;
    String name;
    Set<MenuItem> menuItems;

    public Set<MenuItem> getMenuItems() {
        return Objects.isNull(menuItems) ? new HashSet<>() : menuItems;
    }


}
