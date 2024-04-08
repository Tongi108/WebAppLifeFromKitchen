package pl.lifefromkitchen.business;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.lifefromkitchen.business.dao.MenuDAO;
import pl.lifefromkitchen.domain.Menu;
import pl.lifefromkitchen.domain.exception.NotFoundException;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@AllArgsConstructor
public class MenuService {

    private final MenuDAO menuDAO;

//    @Transactional
//    public Menu findMenuByProducerName(String producerName){
//        Optional <Menu> menu = menuDAO.findMenu(producerName);
//        if(menu.isEmpty()) {
//            throw new NotFoundException("Could not find producer by producer name: [%s]".formatted(producerName));
//        }
//        return menu.get();
//    }

    @Transactional
    public List<Menu> findMenuByProducerName(String producerName) {
        List<Menu> menu = menuDAO.findMenu(producerName);
        if (menu.isEmpty()) {
            throw new NotFoundException("Could not find menu by producer name: [%s]".formatted(producerName));
        }
        return menu;
    }


}
