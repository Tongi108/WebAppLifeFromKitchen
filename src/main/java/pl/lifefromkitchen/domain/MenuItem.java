package pl.lifefromkitchen.domain;

import lombok.*;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@With
@Value
@Builder
@EqualsAndHashCode(of = "menuItemId")
@ToString(of = {"name", "price"})
public class MenuItem {

    Integer menuItemId;
    String name;
    String description;
    BigDecimal price;
    String imageUrl;
    MenuItemCategory menuItemCategory;
    Set<Menu> menus;
    Set<OrderDetail> orderDetails;

    public Set<Menu> getMenus() {
        return Objects.isNull(menus) ? new HashSet<>() : menus;
    }

    public Set<OrderDetail> getOrderDetail() {
        return Objects.isNull(orderDetails) ? new HashSet<>() : orderDetails;
    }

}
