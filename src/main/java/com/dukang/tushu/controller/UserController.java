package com.dukang.tushu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	@RequestMapping("/hello")//请求的映射，和浏览器请求的url一致
    public void hello()
    {
        System.out.println("hello word");
    }
}
