package pl.lifefromkitchen.business;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.lifefromkitchen.business.dao.MenuCategoryDAO;
import pl.lifefromkitchen.domain.exception.NotFoundException;

import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class MenuCategoryService {

    private final MenuCategoryDAO menuCategoryDAO;

    @Transactional
    public List<String> findCategories(String producerName) {
        List<String> category = menuCategoryDAO.findMenuCategoryByProducerName(producerName);
        if (category.isEmpty()) {
            throw new NotFoundException("Could not find menu  by producer name: [%s]".formatted(producerName));
        }
        return category;
    }




}
