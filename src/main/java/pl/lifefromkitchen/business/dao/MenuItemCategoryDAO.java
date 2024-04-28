package pl.lifefromkitchen.business.dao;

import pl.lifefromkitchen.domain.MenuItemCategory;

import java.util.List;

public interface MenuItemCategoryDAO {

    List<MenuItemCategory> findAllMenuItemCategoryName();
}
