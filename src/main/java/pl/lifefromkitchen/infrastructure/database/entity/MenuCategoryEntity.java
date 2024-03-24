package pl.lifefromkitchen.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;
import pl.lifefromkitchen.domain.Menu;

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
    @GeneratedValue()
    @Column(name = "menu_category_id")
    private Integer menuCategoryId;

    @Column(name = "name")
    String name;

    @OneToMany(mappedBy = "menu_category", fetch = FetchType.LAZY)
    private Set<MenuEntity> menus;



}
