package pl.lifefromkitchen.infrastructure.database.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.lifefromkitchen.infrastructure.database.entity.MenuItemCategoryEntity;
@Repository
public interface MenuItemCategoryJpaRepository extends JpaRepository<MenuItemCategoryEntity, Integer> {


}
