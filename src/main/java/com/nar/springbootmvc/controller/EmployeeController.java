package com.nar.springbootmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class EmployeeController {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String getEmployeeHome () {
        return "index";
    }
}
