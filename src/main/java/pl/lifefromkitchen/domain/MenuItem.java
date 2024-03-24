package pl.lifefromkitchen.domain;

import lombok.*;

import java.util.Set;

@With
@Value
@Builder
@EqualsAndHashCode(of = "menuItemId")
@ToString(of = {"menuItemId", "name", "price"})
public class MenuItem {

    Integer menuItemId;
    String name;
    String price;
    String imageUrl;
    MenuItemCategory menuItemCategory;
    Set<OrderDetail> orderDetails;
    Set<MenuMenuItem> menuMenuItems;//sprawdzić czy tak może być(połączenie ManyToMany)
}
