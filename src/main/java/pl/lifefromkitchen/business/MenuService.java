package pl.lifefromkitchen.business;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.lifefromkitchen.api.dto.MenuDTO;
import pl.lifefromkitchen.business.dao.MenuCategoryDAO;
import pl.lifefromkitchen.business.dao.MenuDAO;
import pl.lifefromkitchen.domain.Menu;
import pl.lifefromkitchen.domain.exception.NotFoundException;

import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class MenuService {

    private final MenuDAO menuDAO;


//    @Transactional
//    public List<String> findCategories(String producerName) {
//        List<String> category = menuDAO.findMenuByProducerName(producerName);
//        if (category.isEmpty()) {
//            throw new NotFoundException("Could not find menu  by producer name: [%s]".formatted(producerName));
//        }
//        return category;
//    }








}
