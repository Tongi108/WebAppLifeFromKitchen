package pl.lifefromkitchen.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode(of = "menuCategoryId")
@ToString(of = {"menuCategoryId", "name"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "menu_category")
public class MenuCategoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "menu_category_id")
    private Integer menuCategoryId;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "menuCategory", fetch = FetchType.LAZY)
    private Set<MenuEntity> menus;



}
