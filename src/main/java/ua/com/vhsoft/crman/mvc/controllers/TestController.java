/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.vhsoft.crman.mvc.controllers;

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
        System.out.println("TestController");
        return "test";
    }
}
