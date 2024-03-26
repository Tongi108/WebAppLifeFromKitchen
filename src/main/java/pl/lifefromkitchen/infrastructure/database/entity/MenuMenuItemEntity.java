package pl.lifefromkitchen.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@EqualsAndHashCode(of = {"menuItemId", "menuId"})
@ToString(of = {"menuItemId", "menuId"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "menu_menuItem")
public class MenuMenuItemEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "menu_item_id")
    private Integer menuItemId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "menu_id")
    private Integer menuId;

}
