package ua.com.vhsoft.crman.mvc.controllers;

import java.util.Date;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ua.com.vhsoft.crman.data.services.SysUserService;
import ua.com.vhsoft.crman.mvc.models.SysUser;

/**
 * @author Timur Berezhnoi
 */
@Controller
@RequestMapping("/register")
public class RegisterController {
	
	@Autowired
	private SysUserService sysUserService;
	
	@ModelAttribute("sys_user")
	public SysUser constructUser() {
		return new SysUser();
	}
	
	@RequestMapping
	public String showRegistrationForm() {
		Logger logger = Logger.getLogger(this.getClass());
		logger.info("User register jsp!");
		return "user-registration";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String doRegister(@Valid @ModelAttribute("sys_user") SysUser user, BindingResult result, RedirectAttributes redirectAttributes) {
		if(result.hasErrors()) {
			return "user-registration";
		}
		
		user.setCreatedOn(new Date());
		sysUserService.addOrUpdate(user);
		redirectAttributes.addFlashAttribute("success", true);
		return "redirect:/login"; // TODO think where to redirect 
	}
}