package pl.lifefromkitchen.domain;

import lombok.*;

@With
@Value
@Builder
@EqualsAndHashCode(of = {"menuItemId", "menuId"})
public class MenuMenuItem {

    Integer menuItemId;
    Integer menuId;
}
