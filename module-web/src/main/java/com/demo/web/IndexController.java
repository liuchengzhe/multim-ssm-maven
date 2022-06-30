package com.demo.web;

import com.demo.orm.po.HelloWorld;
import com.demo.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    private HelloWorldService helloWorldService;

    @RequestMapping("/")
    public String index() {
        return "welcome";
    }

    @RequestMapping("/hello")
    public String hello(String name) {
        return helloWorldService.getHellWorld(name);
    }

    @RequestMapping("/getById")
    public HelloWorld getById(int id) {
        return helloWorldService.getById(id);
    }
}
