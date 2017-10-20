package com.liu.springcloud.custom1.controller;

import feign.Param;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by 刘元波 on 2017/8/27.
 */
@RestController
@RefreshScope      //git上面的配置修改后自动刷新。与config中spring-boot-starter-actuator配合使用

public class IndexController {
    @Value("${name}")
    private String name;
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(@RequestParam("msg") String msg){
        System.out.println(msg);
        return name;
//        return "hello, I am custom1";
    }
}
