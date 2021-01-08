package com.zhang.spring.springConfig;

import com.zhang.spring.bean.Person;
import com.zhang.spring.component.Component1;
import com.zhang.spring.component.Component2;
import com.zhang.spring.impl.MyImport1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.spring.springConfig
 * @date:2021/1/8
 */
@Configuration
@Import({Component1.class, Component2.class, MyImport1.class})
public class ImportConfig {

    @Bean
    public Person zs(){
        System.out.println("这是person对象被初始化了...");
        return new Person("zs",10);
    }


}
