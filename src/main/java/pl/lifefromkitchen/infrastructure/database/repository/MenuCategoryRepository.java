package pl.lifefromkitchen.infrastructure.database.repository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import pl.lifefromkitchen.business.dao.MenuCategoryDAO;
import pl.lifefromkitchen.infrastructure.database.repository.jpa.MenuCategoryJpaRepository;

import java.util.List;

@Repository
@AllArgsConstructor
public class MenuCategoryRepository implements MenuCategoryDAO {

    private final MenuCategoryJpaRepository menuCategoryJpaRepository;


    @Override
    public List<String> findMenuCategoryByProducerName(String producerName) {
        return menuCategoryJpaRepository.findMenuCategoryByProducerName(producerName);
    }
}
