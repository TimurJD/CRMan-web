package ua.com.vhsoft.crman.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
@Controller
public class IndexController {
    
    @RequestMapping(path = {"/", "/index"}, method = RequestMethod.GET)
    public String entryPoint(Model model) {
        return "activities";
    }
    
    @RequestMapping("/error403")
    public String accesDeniedPage(Model model) {
        return "error403";
    }
}
