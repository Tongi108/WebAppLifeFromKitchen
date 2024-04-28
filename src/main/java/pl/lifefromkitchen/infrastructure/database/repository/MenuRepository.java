package pl.lifefromkitchen.infrastructure.database.repository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import pl.lifefromkitchen.business.dao.MenuDAO;
import pl.lifefromkitchen.domain.Menu;
import pl.lifefromkitchen.infrastructure.database.repository.jpa.MenuJpaRepository;
import pl.lifefromkitchen.infrastructure.database.repository.mapper.MenuEntityMapper;

import java.util.List;

@Repository
@AllArgsConstructor
public class MenuRepository implements MenuDAO {

    private final MenuJpaRepository menuJpaRepository;
    private final MenuEntityMapper menuEntityMapper;

    @Override
    public  List<Menu> findMenuByProducerName(String producerName) {
        return menuJpaRepository.findMenuEntitiesByProducer_Name(producerName)
                .stream()
                .map(menuEntityMapper::mapFromEntity)
                .toList();

    }
}
