package com.lucky.feign.hyrc;

import com.lucky.feign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @Auther: chaoqiang.zhou
 * @Date: 2018/11/2 15:58
 * @Description:
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}