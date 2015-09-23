package ua.com.vhsoft.crman.mvc.controllers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Timur Berezhnoi
 *
 */
@Controller
public class InvoicesController {
	
	private final Logger LOGGER = Logger.getLogger(this.getClass());
	
	@RequestMapping(path = "/invoices")
	public String showInvoices() {
		LOGGER.info("Invoices view request");
		return "invoices";
	}
}