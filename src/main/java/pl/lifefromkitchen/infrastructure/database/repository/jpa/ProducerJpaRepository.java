package pl.lifefromkitchen.infrastructure.database.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.lifefromkitchen.domain.Producer;
import pl.lifefromkitchen.infrastructure.database.entity.ProducerEntity;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProducerJpaRepository extends JpaRepository<ProducerEntity, Integer> {
    @Query("SELECT DISTINCT p.city FROM ProducerEntity p")
    List<String> findCitiesWithProducers();


    List<ProducerEntity> findByCity(String city);

    Optional<ProducerEntity>findByName(String name);




}
