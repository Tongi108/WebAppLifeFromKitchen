package pl.lifefromkitchen.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode(of = "menuId")
@ToString(of = {"menuId", "description"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "menu")
public class MenuEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "menu_id")
    Integer menuId;

    @Column(name = "description")
    String description;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "producer_id")
    ProducerEntity producer;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "menu_category_id")
    MenuCategoryEntity menuCategory;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "menus")
    private Set<MenuItemEntity> menuOfItems;
}
