package pl.lifefromkitchen.business.dao;

import pl.lifefromkitchen.domain.Menu;

import java.util.List;
import java.util.Optional;

public interface MenuDAO {
    List<Menu> findMenu(String producerName);





}
