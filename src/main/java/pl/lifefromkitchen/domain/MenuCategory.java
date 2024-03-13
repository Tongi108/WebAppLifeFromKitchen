package pl.lifefromkitchen.domain;

import lombok.*;

@With
@Value
@Builder
@EqualsAndHashCode(of = "menuCategoryId")
@ToString(of = {"menuCategoryId", "name"})
public class MenuCategory {

    Integer menuCategoryId;
    String name;
}
