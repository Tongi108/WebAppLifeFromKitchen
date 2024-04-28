package pl.lifefromkitchen.infrastructure.database.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.lifefromkitchen.infrastructure.database.entity.MenuEntity;

import java.util.List;

@Repository
public interface MenuJpaRepository extends JpaRepository<MenuEntity, Integer> {


     @Query("SELECT mc.name FROM MenuEntity m JOIN m.menuCategory mc WHERE m.producer.name = :producerName")
     List<String> findMenuCategoryByProducerName(@Param("producerName") String producerName);






}
