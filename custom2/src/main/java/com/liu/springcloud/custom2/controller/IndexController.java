package com.liu.springcloud.custom2.controller;

import com.liu.springcloud.custom2.feign.FeignService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by 刘元波 on 2017/8/27.
 */
@RestController
public class IndexController {
    @Autowired
    private FeignService feignService;
//方法上面不需要HystrixCommand这个注解。feign默认使用这个
    @HystrixCommand
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return feignService.hello("custom2传过来的值");
    }
}

