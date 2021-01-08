package com.zhang.spring;

import static org.junit.Assert.assertTrue;

import com.zhang.spring.bean.Person;
import com.zhang.spring.springConfig.ConditionalConfig;
import com.zhang.spring.springConfig.CustomerConfig;
import com.zhang.spring.springConfig.FirstConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
       private ApplicationContext context1 = new AnnotationConfigApplicationContext(FirstConfig.class);
       private ApplicationContext context2 = new AnnotationConfigApplicationContext(CustomerConfig .class);
       private ApplicationContext context3 = new AnnotationConfigApplicationContext(ConditionalConfig  .class);
    /**
     * 测试第一个FirstConfig
     */
    @Test
    public void test01(){
        Person person = context1.getBean("person1",Person.class);
        System.out.println(person);
        String[] names = context1.getBeanNamesForType(Person.class);
        for (String name : names) {
            System.out.println(name);
        }
    }

    /**
     * 测试自动扫描组件
     */
    @Test
    public void test02(){
        String[] beanDefinitionNames = context1.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }
    /**
     * 测试自定义扫描指定类
     */
    @Test
    public void test03(){
        String[] beanDefinitionNames = context2.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }
    /**
     * 测试scope
     */
    @Test
    public void test04(){
        String[] beanDefinitionNames = context2.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
        Person person = context2.getBean("person1",Person.class);
        System.out.println();
    }

    /**
     * 测试conditional注解，决定加载那个bean
     */
    @Test
    public void test05(){
        Environment environment = context3.getEnvironment();
        String osName = environment.getProperty("os.name");
        System.out.println("系统环境："+osName);

    }
}
