package com.liu.springcloud.custom2.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by 刘元波 on 2017/8/27.
 */
@FeignClient(value = "custom1",fallback = FeignService.FeignServiceImpl.class)
public interface FeignService {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String hello();

    @Component
    class FeignServiceImpl implements FeignService{
        @Override
        public String hello() {
            return "the custom1 is down";
    }
    }
}
