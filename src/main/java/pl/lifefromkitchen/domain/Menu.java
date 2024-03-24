package pl.lifefromkitchen.domain;

import lombok.*;

@With
@Value
@Builder
@EqualsAndHashCode(of = "MenuId")
@ToString(of = {"MenuId", "description"})
public class Menu {

    Integer MenuId;
    String description;
    Producer producer;
    MenuCategory menuCategory;
}
