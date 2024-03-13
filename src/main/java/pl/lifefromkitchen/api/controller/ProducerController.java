package pl.lifefromkitchen.api.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.lifefromkitchen.api.dto.ProducerDTO;
import pl.lifefromkitchen.api.dto.mapper.ProducerMapper;
import pl.lifefromkitchen.business.ProducerService;

import java.util.List;

@Controller
@AllArgsConstructor
public class ProducerController {

    private ProducerMapper producerMapper;


    private ProducerService producerService;

    public static final String PRODUCER = "/producers";




    @GetMapping("/")
    public String showProducers(Model model) {
        List<ProducerDTO> producers = producerMapper.mapToDTOs(producerService.findAllProducers());
        model.addAttribute("producers", producers);
        model.addAttribute("selectedProducer", new ProducerDTO());
        return "producers";
    }
}
