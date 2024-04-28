package pl.lifefromkitchen.infrastructure.database.repository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import pl.lifefromkitchen.business.dao.MenuItemDAO;
import pl.lifefromkitchen.domain.MenuItem;
import pl.lifefromkitchen.infrastructure.database.repository.jpa.MenuItemJpaRepository;
import pl.lifefromkitchen.infrastructure.database.repository.mapper.MenuItemEntityMapper;

import java.util.List;

@Repository
@AllArgsConstructor
public class MenuItemRepository implements MenuItemDAO {

    private final MenuItemJpaRepository menuItemJpaRepository;
    private final MenuItemEntityMapper menuItemEntityMapper;


//    @Override
//    public List<MenuItem> findMenuItemsByMenuCategoryName(String categoryName) {
//        return menuItemJpaRepository.findMenuDetailsByCategoryName(categoryName)
//                .stream()
//                .map(menuItemEntityMapper::mapFromEntity)
//                .toList();
//
//    }
}
