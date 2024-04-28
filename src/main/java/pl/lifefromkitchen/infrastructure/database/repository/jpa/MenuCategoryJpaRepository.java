package pl.lifefromkitchen.infrastructure.database.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.lifefromkitchen.infrastructure.database.entity.MenuCategoryEntity;

import java.util.List;

@Repository
public interface MenuCategoryJpaRepository extends JpaRepository<MenuCategoryEntity, Integer> {
@Query("SELECT mc.name FROM MenuCategoryEntity mc JOIN mc.menus m WHERE m.producer.name = :producerName")
List<String> findMenuCategoryByProducerName(@Param("producerName") String producerName);





}
