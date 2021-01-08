package com.zhang.spring.springConfig;

import com.zhang.spring.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.spring.springConfig
 * @date:2021/1/8
 */
@Configuration
public class ConditionalConfig {

    @Bean
    //加在方法上
    @Conditional(ZsConditional.class)
    public Person zs(){
        System.out.println("这是windows系统");
        return new Person("zs",10);
    }

    @Bean
    @Conditional(LsConditional.class)
    public Person ls(){
        System.out.println("这是Linux系统");
        return new Person("ls",20);
    }
}
