package ua.com.vhsoft.crman.mvc.controllers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
@Controller()
public class ActivityController {
    
    private final Logger LOGGER = Logger.getLogger(this.getClass());
    
    @RequestMapping(value = "/activities")
    public String showActivities(Model model) {
        LOGGER.info("Activities view request");
        return "activities";
    }
    
    
}
