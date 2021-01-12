package com.zhang.spring.config;

import com.zhang.spring.aspects.DivAspects;
import com.zhang.spring.bean.TestAspects;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.spring.config
 * @date:2021/1/12
 */

@Configuration
@EnableAspectJAutoProxy
public class TestAspects01 {

    @Bean
    public TestAspects testAspects(){

        return new TestAspects();
    }

    @Bean
    public DivAspects divAspects(){

        return new DivAspects();
    }
}
