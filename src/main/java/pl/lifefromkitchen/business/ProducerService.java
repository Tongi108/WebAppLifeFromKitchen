package pl.lifefromkitchen.business;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.lifefromkitchen.business.dao.ProducerDAO;
import pl.lifefromkitchen.domain.Producer;

import java.util.List;

@Slf4j
@Service
@AllArgsConstructor

public class ProducerService {

    private final ProducerDAO producerDAO;

    @Transactional
    public List<Producer> findAllProducers() {

        return producerDAO.findAll();
    }
}
