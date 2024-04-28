package pl.lifefromkitchen.infrastructure.database.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.lifefromkitchen.infrastructure.database.entity.MenuEntity;

import java.util.List;

@Repository
public interface MenuJpaRepository extends JpaRepository<MenuEntity, Integer> {


//     @Query("SELECT m FROM MenuEntity m WHERE m.producer.name = :producerName")
     List<MenuEntity> findMenuEntitiesByProducer_Name(@Param("producerName") String producerName);






}
