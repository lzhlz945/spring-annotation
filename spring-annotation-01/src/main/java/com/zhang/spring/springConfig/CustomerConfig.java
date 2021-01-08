package com.zhang.spring.springConfig;

import com.zhang.spring.bean.Person;
import com.zhang.spring.impl.MyCustomer;
import org.springframework.context.annotation.*;

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
//    @Scope(value = "prototype")
//    @Scope(value = "Singleton")
    @Bean
    @Lazy
    public Person person1(){
        System.out.println("person被创建了.....");
        return new Person("zs",20);
    }

}
