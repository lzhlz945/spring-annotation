package com.zhang.spring.springConfig;

import com.zhang.spring.bean.Person;
import com.zhang.spring.dao.FirstDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.spring.springConfig
 * @date:2021/1/8
 */
@Configuration
@ComponentScan(basePackages = {"com.zhang.spring"},includeFilters = {
        @ComponentScan.Filter(type=FilterType.CUSTOM,classes = {MyCustomer.class})
},useDefaultFilters = false)
public class CustomerConfig {
    @Bean
    public Person person1(){
        return new Person("zs",20);
    }

}
