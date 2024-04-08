package pl.lifefromkitchen.domain;

import lombok.*;

import java.math.BigDecimal;
import java.util.Set;

@With
@Value
@Builder
@EqualsAndHashCode(of = "menuItemId")
@ToString(of = {"menuItemId", "name", "price"})
public class MenuItem {

    Integer menuItemId;
    String name;
    BigDecimal price;
    String imageUrl;
    MenuItemCategory menuItemCategory;
    Set<Menu> menus;
    Set<OrderDetail> orderDetails;

}
