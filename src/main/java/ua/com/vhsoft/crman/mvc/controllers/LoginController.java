package ua.com.vhsoft.crman.mvc.controllers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Timur Berezhnoi
 */
@Controller
public class LoginController {

    private final Logger LOGGER = Logger.getLogger(this.getClass());

    @RequestMapping(path = "/login", method = RequestMethod.GET)
    public String login(@RequestParam(value = "error", required = false) String error, Model model) {
        LOGGER.info("User login view request");
        if (error != null) {
            model.addAttribute("error", "Invalid username and password!");
        }
        return "login";
    }

//    @RequestMapping(path = "/login/failed", method = RequestMethod.GET)
//    public String loginFailed(Model model) {
//        model.addAttribute("error", "failed");
//        return "login";
//    }
}
