package com.dukang.tushu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	@RequestMapping("/hello")
    public void hello()
    {
        System.out.println("hello word");
    }
}
