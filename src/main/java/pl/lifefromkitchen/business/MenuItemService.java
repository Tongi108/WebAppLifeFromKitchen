package pl.lifefromkitchen.business;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.lifefromkitchen.business.dao.MenuItemDAO;

@Slf4j
@Service
@AllArgsConstructor
public class MenuItemService {

    private final MenuItemDAO menuItemDAO;

//    @Transactional
//    public List<MenuItem> findMenuDetails(String categoryName) {
//        List<MenuItem> menuItems = menuItemDAO.findMenuItemsByMenuCategoryName(categoryName);
//        if (menuItems.isEmpty()) {
//            throw new NotFoundException("Could not find menu items by category name: [%s]".formatted(categoryName));
//        }
//        return menuItems;
//    }

}










