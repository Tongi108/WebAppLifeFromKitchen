package pl.lifefromkitchen.api.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import pl.lifefromkitchen.api.dto.MenuDTO;
import pl.lifefromkitchen.api.dto.ProducerDTO;
import pl.lifefromkitchen.api.dto.mapper.MenuItemMapper;
import pl.lifefromkitchen.api.dto.mapper.MenuMapper;
import pl.lifefromkitchen.api.dto.mapper.ProducerMapper;
import pl.lifefromkitchen.business.MenuCategoryService;
import pl.lifefromkitchen.business.MenuItemService;
import pl.lifefromkitchen.business.MenuService;
import pl.lifefromkitchen.business.ProducerService;

import java.util.List;

@Controller
@AllArgsConstructor
public class MenuController {

    private ProducerMapper producerMapper;
    private ProducerService producerService;
    private MenuCategoryService menuCategoryService;
    private MenuService menuService;
    private MenuMapper menuMapper;


    @GetMapping("/city")
    public String chooseCity(@RequestParam(value = "city") String city, Model model) {
        List<ProducerDTO> producers = producerMapper.mapToDTOs(producerService.findProducersByCity(city));
        model.addAttribute("producers", producers);
        model.addAttribute("cityName", city);
        return "producers_in_city";
    }

    @GetMapping("/{producer}/menu_details")
    public String showProducerMenu(Model model, @PathVariable String producer) {
        List<String> categories = menuCategoryService.findCategories(producer);

        model.addAttribute("producer", producer);
        model.addAttribute("categories", categories);
        return "menu";
    }


//    @GetMapping("{categoryName}/menu_details")
//    public String showMenuDetails(Model model, @PathVariable String categoryName) {
//        List<MenuItemDTO> menuItems = menuItemMapper.mapToDTOs(menuItemService.findMenuDetails(categoryName));
//        model.addAttribute("menuItems", menuItems);
//        model.addAttribute("categoryName", categoryName);
//        return "menu_details";
//    }
}
