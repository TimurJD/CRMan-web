package ua.com.vhsoft.crman.mvc.controllers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Timur Berezhnoi
 *
 */
@Controller
public class AccountController {
	
	 private final Logger LOGGER = Logger.getLogger(this.getClass());
	
	@RequestMapping(path = "/accounts")
	public String showAccounts() {
		LOGGER.info("Accounts view request");
		return "accounts";
	}
}