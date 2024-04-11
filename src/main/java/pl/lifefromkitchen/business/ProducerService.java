package pl.lifefromkitchen.business;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.lifefromkitchen.api.dto.MenuDTO;
import pl.lifefromkitchen.business.dao.MenuDAO;
import pl.lifefromkitchen.business.dao.ProducerDAO;
import pl.lifefromkitchen.domain.Menu;
import pl.lifefromkitchen.domain.Producer;
import pl.lifefromkitchen.domain.exception.NotFoundException;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@AllArgsConstructor
public class ProducerService {

    private final ProducerDAO producerDAO;



    @Transactional
    public List<String> findCitiesWhereThereAreProducers() {
        return producerDAO.findCities();
    }

    @Transactional
    public List<Producer> findProducersByCity(String city) {
        return producerDAO.findProducersInCity(city);
    }






}
