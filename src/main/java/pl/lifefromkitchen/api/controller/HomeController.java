package pl.lifefromkitchen.api.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.lifefromkitchen.api.dto.mapper.ProducerMapper;
import pl.lifefromkitchen.business.ProducerService;

import java.util.List;

@Controller
@AllArgsConstructor
public class HomeController {

    private ProducerMapper producerMapper;
    private ProducerService producerService;

    @GetMapping("/")
    public String showCities(Model model) {
        List<String> cities = producerMapper.mapToDTOsString(producerService.findCitiesWhereThereAreProducers());
        model.addAttribute("cities", cities);
        return "home";
    }
}
