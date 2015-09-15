package ua.com.vhsoft.crman.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
@Controller
public class IndexController {
    
    @RequestMapping("/")
    public String entryPoint(String model) {
        return "activities";
    }
    
}
