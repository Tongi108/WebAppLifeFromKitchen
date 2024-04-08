package pl.lifefromkitchen.business.dao;

import pl.lifefromkitchen.domain.Producer;

import java.util.List;
import java.util.Optional;

public interface ProducerDAO {



    List<String> findCities();

    List<Producer> findProducersInCity(String city);

    Optional<Producer> findById(Integer producerId);

    Optional<Producer> findByName(String name);



}
