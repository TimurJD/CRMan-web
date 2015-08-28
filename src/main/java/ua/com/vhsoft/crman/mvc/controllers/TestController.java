package ua.com.vhsoft.crman.mvc.controllers;

import org.apache.log4j.Logger;
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
        Logger logger = Logger.getLogger(this.getClass());
        logger.info("!!!!!!!!!!!!!!!!!!!!!!!!!!logger message");
        
        return "test";
    }
}
