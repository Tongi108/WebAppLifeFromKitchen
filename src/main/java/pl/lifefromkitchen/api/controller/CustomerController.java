package pl.lifefromkitchen.api.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.lifefromkitchen.api.dto.MenuDTO;
import pl.lifefromkitchen.api.dto.ProducerDTO;
import pl.lifefromkitchen.api.dto.mapper.MenuMapper;
import pl.lifefromkitchen.api.dto.mapper.ProducerMapper;
import pl.lifefromkitchen.business.MenuService;
import pl.lifefromkitchen.business.ProducerService;

import java.util.List;

@Controller
@AllArgsConstructor
public class CustomerController {

    private ProducerMapper producerMapper;
    private ProducerService producerService;
    private MenuService menuService;
    private MenuMapper menuMapper;




    @GetMapping("/")
    public String showCities(Model model) {
        List<String> cities = producerMapper.mapToDTOsString(producerService.findCitiesWhereThereAreProducers());
        model.addAttribute("cities", cities);
        return "home";
    }

    @GetMapping("/city")
    public String chooseCity(@RequestParam(value = "city") String city, Model model) {
        List<ProducerDTO> producers = producerMapper.mapToDTOs(producerService.findProducersByCity(city));
        model.addAttribute("producers", producers);
        model.addAttribute("cityName", city);
        return "producers_in_city";
    }

    @GetMapping("/producer")
    public String showProducerMenu(@RequestParam(value = "producerName") String producerName, Model model) {
        List<MenuDTO> menuDTO = menuMapper.mapToDTOs(menuService.findMenuByProducerName(producerName));
        model.addAttribute("menus", menuDTO);
        model.addAttribute("producerName", producerName);
        return "menu";
    }


}
