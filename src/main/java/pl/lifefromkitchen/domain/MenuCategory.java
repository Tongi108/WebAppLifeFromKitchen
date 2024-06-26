package pl.lifefromkitchen.domain;

import lombok.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@With
@Value
@Builder
@EqualsAndHashCode(of = "menuCategoryId")
@ToString(of = {"menuCategoryId", "name"})
public class MenuCategory {

    Integer menuCategoryId;
    String name;
    Set<Menu> menus;

    public Set<Menu> getMenus() {
        return Objects.isNull(menus) ? new HashSet<>() : menus;
    }
}
