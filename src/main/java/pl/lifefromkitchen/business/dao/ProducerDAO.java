package pl.lifefromkitchen.business.dao;

import pl.lifefromkitchen.domain.Producer;

import java.util.List;

public interface ProducerDAO {

    List<Producer> findAll();
}
