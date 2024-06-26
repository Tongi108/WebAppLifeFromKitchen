package pl.lifefromkitchen.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode(of = "menuItemId")
@ToString(of = {"name", "price", "description"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "menu_item")
public class MenuItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "menu_item_id")
    private Integer menuItemId;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "image")
    private String imageUrl;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "menu_item_category_id")
    private MenuItemCategoryEntity menuItemCategory;


    @ManyToMany(mappedBy = "menuOfItems", fetch = FetchType.EAGER)
    private Set<MenuEntity> menus;


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "menuItem")
    private Set<OrderDetailEntity> orderDetails;


}
