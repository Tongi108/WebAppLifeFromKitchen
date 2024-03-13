package pl.lifefromkitchen.domain;

import lombok.*;

@With
@Value
@Builder
@EqualsAndHashCode(of = "menuItemCategoryId")
@ToString(of = {"menuItemCategoryId", "name"})
public class MenuItemCategory {

    Integer menuItemCategoryId;
    String name;
}
