package pl.lifefromkitchen.infrastructure.database.repository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import pl.lifefromkitchen.business.dao.ProducerDAO;
import pl.lifefromkitchen.domain.Producer;
import pl.lifefromkitchen.infrastructure.database.repository.jpa.ProducerJpaRepository;
import pl.lifefromkitchen.infrastructure.database.repository.mapper.ProducerEntityMapper;

import java.util.List;

@Repository
@AllArgsConstructor
public class ProducerRepository implements ProducerDAO {

    private final ProducerJpaRepository producerJpaRepository;
    private final ProducerEntityMapper producerEntityMapper;
    @Override
    public List<Producer> findAll() {
        return producerJpaRepository.findAll().stream()
                .map(entity -> producerEntityMapper.mapFromEntity(entity))
                .toList();
    }
}
