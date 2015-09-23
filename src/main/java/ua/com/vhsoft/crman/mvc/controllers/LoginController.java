package ua.com.vhsoft.crman.mvc.controllers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Timur Berezhnoi
 */
@Controller
public class LoginController {

    private final Logger LOGGER = Logger.getLogger(this.getClass());

    @RequestMapping(path = "/login**", method = RequestMethod.GET)
    public String showLoggin(Model model) {
        LOGGER.info("User login view request");
        
        return "login";
    }

}