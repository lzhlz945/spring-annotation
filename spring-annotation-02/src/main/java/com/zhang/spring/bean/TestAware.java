package com.zhang.spring.bean;

import lombok.Data;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.spring.bean
 * @date:2021/1/11
 */
@Data
@Component
public class TestAware implements ApplicationContextAware,BeanNameAware {
    private ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("注入到TestAware的spring的自己的组件applicationContext"+applicationContext);

        this.applicationContext=applicationContext;
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("获取spring给TestAware的名称"+s);
    }
}
