package pl.lifefromkitchen.domain;

import lombok.*;

import java.util.Objects;

@With
@Value
@Builder
@EqualsAndHashCode(of = {"menuItemId", "menuId"})
@ToString(of = {"menuItemId", "menuId"})
public class MenuMenuItem {

    Integer menuItemId;
    Integer menuId;

    
}
