package pl.lifefromkitchen.domain;

import lombok.*;

@With
@Value
@Builder
@EqualsAndHashCode(of = "MenuId")
@ToString(of = {"MenuId", "description", "producerId", "menuCategory"})
public class Menu {

    Integer MenuId;
    String description;
    Integer producerId;
    Integer menuCategory;
}
