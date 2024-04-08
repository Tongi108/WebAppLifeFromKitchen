package pl.lifefromkitchen.infrastructure.database.repository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import pl.lifefromkitchen.business.dao.ProducerDAO;
import pl.lifefromkitchen.domain.Producer;
import pl.lifefromkitchen.infrastructure.database.repository.jpa.ProducerJpaRepository;
import pl.lifefromkitchen.infrastructure.database.repository.mapper.ProducerEntityMapper;

import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
public class ProducerRepository implements ProducerDAO {

    private final ProducerJpaRepository producerJpaRepository;
    private final ProducerEntityMapper producerEntityMapper;


    @Override
    public List<String> findCities() {
        return producerJpaRepository.findCitiesWithProducers();

    }

    @Override
    public List<Producer> findProducersInCity(String city) {
        return producerJpaRepository.findByCity(city)
                .stream()
                .map(producerEntityMapper::mapFromEntity)
                .toList();
    }

    @Override
    public Optional<Producer> findById(Integer producerId) {
        return producerJpaRepository.findById(producerId)
                .map(producerEntityMapper::mapFromEntity);
    }

    @Override
    public Optional<Producer> findByName(String name) {
        return producerJpaRepository.findByName(name)
                .map(producerEntityMapper::mapFromEntity);
    }




}
