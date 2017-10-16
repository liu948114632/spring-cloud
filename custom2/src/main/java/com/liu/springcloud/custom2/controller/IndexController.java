package com.liu.springcloud.custom2.controller;

import com.liu.springcloud.custom2.feign.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 刘元波 on 2017/8/27.
 */
@RestController
public class IndexController {
    @Autowired
    private FeignService feignService;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return feignService.hello();
    }
}

