package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <h3>springmvc-started</h3>
 * <p>入门控制器</p>
 *
 * @author : Chengjie Zhang
 * @date : 2020-08-11 12:51
 **/
@Controller
@RequestMapping(path = "start")
public class HelloController {

    @RequestMapping(path = "/hello")
    public String sayHello() {
        System.out.println("Hello World!!!");
        return "success";
    }

    @RequestMapping(path = "/fuck")
    public String sayFuck() {
        System.out.println("Hello Fuck!!!");
        return "success";
    }
}
