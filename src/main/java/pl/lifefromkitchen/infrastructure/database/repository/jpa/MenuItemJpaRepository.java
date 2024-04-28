package pl.lifefromkitchen.infrastructure.database.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.lifefromkitchen.infrastructure.database.entity.MenuItemEntity;

import java.util.List;

@Repository
public interface MenuItemJpaRepository extends JpaRepository<MenuItemEntity, Integer> {

//    @Query("SELECT mi FROM MenuItemEntity mi JOIN mi.menus m  JOIN m.menuCategory mc  WHERE mc.name = :categoryName")
//    List<MenuItemEntity> findMenuDetailsByCategoryName(@Param("categoryName") String categoryName);


}
