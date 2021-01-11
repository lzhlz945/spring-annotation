package com.zhang.spring.springConfig;

import com.zhang.spring.bean.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.spring.springConfig
 * @date:2021/1/11
 */
@Configuration
@ComponentScan({"com.zhang.spring"})
@PropertySource(value = {"classpath:/TestValue.properties"})
public class ValueConfig {
    @Bean
    public Student student(){
        return new Student();
    }
}
