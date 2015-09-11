package ua.com.vhsoft.crman.mvc.controllers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Timur Berezhnoi
 */
@Controller
public class LoginController {

	@RequestMapping("/login")
	public String login() {
		Logger logger = Logger.getLogger(this.getClass());
		logger.info("User login!");
		return "login";
	}
}

