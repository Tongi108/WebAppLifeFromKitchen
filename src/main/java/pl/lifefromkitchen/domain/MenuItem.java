package pl.lifefromkitchen.domain;

import lombok.*;

@With
@Value
@Builder
@EqualsAndHashCode(of = "MenuItemId")
@ToString(of = {"MenuItemId", "name", "price"})
public class MenuItem {

    Integer MenuItemId;
    String name;
    String price;
    String imageUrl;
    Integer menuItemCategoryId;
}
