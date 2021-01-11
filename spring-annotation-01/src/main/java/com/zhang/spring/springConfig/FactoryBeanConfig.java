package com.zhang.spring.springConfig;

import com.zhang.spring.bean.TestInitAndDestroy;
import com.zhang.spring.impl.MyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.spring.springConfig
 * @date:2021/1/11
 */
@Configuration
@ComponentScan({"com.zhang.spring"})
public class FactoryBeanConfig {

    @Bean
    public MyFactoryBean myFactoryBean(){
        return  new MyFactoryBean();
    }

    @Scope("prototype")
    @Bean(initMethod = "init",destroyMethod = "destroy")
    public TestInitAndDestroy testInitAndDestroy(){

      return   new TestInitAndDestroy();
    }
}
