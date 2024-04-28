package pl.lifefromkitchen.business.dao;

import pl.lifefromkitchen.domain.Menu;

import java.util.List;

public interface MenuDAO {

    List<Menu> findMenuByProducerName(String producerName);





}
