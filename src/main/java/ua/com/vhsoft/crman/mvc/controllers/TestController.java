package ua.com.vhsoft.crman.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author VH
 */
@Controller()
public class TestController {

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String helloWorld(Model model) {
        return "test";
    }
}
