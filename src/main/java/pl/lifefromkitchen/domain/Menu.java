package pl.lifefromkitchen.domain;

import lombok.*;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@With
@Value
@Builder
@EqualsAndHashCode(of = "menuId")
@ToString(of = {"menuId", "description", "menuImage"})
public class Menu {

    Integer menuId;
    String name;
    String category;
    String description;
    String menuImage;
    BigDecimal price;
    Producer producer;








}
