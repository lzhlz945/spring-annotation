package com.zhang.spring.springConfig;

import com.zhang.spring.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.spring.springConfig
 * @date:2021/1/8
 */
@Configuration
public class FirstConfig {

    @Bean
    public Person person(){
        return new Person("zs",20);
    }

}
