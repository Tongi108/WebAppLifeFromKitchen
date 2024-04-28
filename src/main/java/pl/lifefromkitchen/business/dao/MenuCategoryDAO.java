package pl.lifefromkitchen.business.dao;

import java.util.List;

public interface MenuCategoryDAO {

    List<String> findMenuCategoryByProducerName(String producerName);



}
