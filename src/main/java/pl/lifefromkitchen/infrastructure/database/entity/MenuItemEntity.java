package pl.lifefromkitchen.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;
import pl.lifefromkitchen.domain.MenuItemCategory;

@Getter
@Setter
@EqualsAndHashCode(of = "menuItemId")
@ToString(of = {"menuItemId", "name", "price"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "menu_item")
public class MenuItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "menu_item_id")
    Integer menuItemId;

    @Column(name = "name")
    String name;

    @Column(name = "price")
    String price;

    @Column(name = "image")
    String imageUrl;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "menu_item_category_id")
    MenuItemCategoryEntity menuItemCategory;

    @ManyToMany

    @OneToMany(fetch = FetchType.LAZY, mappedBy = )
}
