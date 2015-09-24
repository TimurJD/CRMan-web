package ua.com.vhsoft.crman.mvc.controllers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Timur Berezhnoi
 *
 */
@Controller
public class OrderController {
	
	private final Logger LOGGER = Logger.getLogger(this.getClass());
	
	@RequestMapping(path = "/orders")
	public String showOrders() {
		LOGGER.info("Orders view request");
		return "orders";
	}
}