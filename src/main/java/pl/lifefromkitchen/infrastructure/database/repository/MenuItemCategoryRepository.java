package pl.lifefromkitchen.infrastructure.database.repository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import pl.lifefromkitchen.business.dao.MenuItemCategoryDAO;
import pl.lifefromkitchen.domain.MenuItemCategory;
import pl.lifefromkitchen.infrastructure.database.repository.jpa.MenuItemCategoryJpaRepository;
import pl.lifefromkitchen.infrastructure.database.repository.mapper.MenuItemCategoryEntityMapper;

import java.util.List;

@Repository
@AllArgsConstructor
public class MenuItemCategoryRepository implements MenuItemCategoryDAO {

    private final MenuItemCategoryJpaRepository menuItemCategoryJpaRepository;
    private final MenuItemCategoryEntityMapper menuItemCategoryEntityMapper;
    @Override
    public List<MenuItemCategory> findAllMenuItemCategoryName() {
        return menuItemCategoryJpaRepository.findAll()
                .stream()
                .map(menuItemCategoryEntityMapper::mapFromEntity)
                .toList();
    }
}
