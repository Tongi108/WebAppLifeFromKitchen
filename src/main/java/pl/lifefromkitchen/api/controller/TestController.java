package pl.lifefromkitchen.api.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@AllArgsConstructor
public class TestController {

     static final String HOMETEST = "/hometest";

    @RequestMapping(value = HOMETEST, method = RequestMethod.GET)
    public String homepage2() {
        return "home2";
    }
}
