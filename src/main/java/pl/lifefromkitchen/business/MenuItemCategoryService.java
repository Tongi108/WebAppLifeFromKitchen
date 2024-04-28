package pl.lifefromkitchen.business;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.lifefromkitchen.business.dao.MenuItemCategoryDAO;

@Slf4j
@Service
@AllArgsConstructor
public class MenuItemCategoryService {

    private final MenuItemCategoryDAO  menuItemCategoryDAO;

//    @Transactional
//    public List<MenuItemCategory> findAllMenuCategoryNames(){
//        List<MenuItemCategory> categories = menuItemCategoryDAO.findAllMenuItemCategoryName();
//        if (categories.isEmpty()) {
//            throw new NotFoundException("Could not find category name of items");
//        }
//        return categories;
//    }
}
