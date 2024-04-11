package pl.lifefromkitchen.api.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import pl.lifefromkitchen.api.dto.MenuDTO;
import pl.lifefromkitchen.api.dto.ProducerDTO;
import pl.lifefromkitchen.api.dto.mapper.MenuMapper;
import pl.lifefromkitchen.api.dto.mapper.ProducerMapper;
import pl.lifefromkitchen.business.MenuService;
import pl.lifefromkitchen.business.ProducerService;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@AllArgsConstructor
public class ProducerMenuController {

    private ProducerMapper producerMapper;
    private ProducerService producerService;
    private MenuService menuService;
    private MenuMapper menuMapper;


    @GetMapping("/city")
    public String chooseCity(@RequestParam(value = "city") String city, Model model) {
        List<ProducerDTO> producers = producerMapper.mapToDTOs(producerService.findProducersByCity(city));
        ProducerDTO producer = producers.getFirst();
        String producerName = producer.getName();
        List<MenuDTO> menuDTO = menuMapper.mapToDTOs(menuService.findMenuByProducerName(producerName));
        model.addAttribute("producers", producers);
        model.addAttribute("cityName", city);
        model.addAttribute("menus", menuDTO);
        return "producers_in_city";
    }

    @GetMapping("/city/producer/{producerName}/menu")
    public String showProducerMenu(Model model, @PathVariable String producerName) {
        List<MenuDTO> menuDTO = menuMapper.mapToDTOs(menuService.findMenuByProducerName(producerName));
        List<String> menuCategoriesName = menuService.findMenuCategoriesNameByProducerName(producerName);
        model.addAttribute("menus", menuDTO);
        model.addAttribute("producerName", producerName);
        model.addAttribute("menuCategoriesName", menuCategoriesName);
        return "menu";
    }


}
