package pl.lifefromkitchen.domain;

import lombok.*;

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


}
