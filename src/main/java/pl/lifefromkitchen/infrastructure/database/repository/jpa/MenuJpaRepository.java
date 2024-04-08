package pl.lifefromkitchen.infrastructure.database.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.lifefromkitchen.domain.Menu;
import pl.lifefromkitchen.infrastructure.database.entity.MenuEntity;
import pl.lifefromkitchen.infrastructure.database.entity.ProducerEntity;

import java.util.List;
import java.util.Optional;

@Repository
public interface MenuJpaRepository extends JpaRepository<MenuEntity, Integer> {

//    @Query("SELECT m FROM MenuEntity m JOIN fetch m.producer prod WHERE prod.name = :producerName")
     List<MenuEntity> findMenuByProducerName(final @Param("producerName") String producerName);




}
