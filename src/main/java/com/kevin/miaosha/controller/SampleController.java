package com.kevin.miaosha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author kevin
 * @version 1.0
 * @date 2021-07-09 22:52
 */
@Controller
public class SampleController {

    @RequestMapping(value = "/thymeleaf",method = RequestMethod.GET)
    public String thymeleaf(Model model){
        model.addAttribute("name","kevin");
        return "hello";
    }
}
