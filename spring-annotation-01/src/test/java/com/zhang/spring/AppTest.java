package com.zhang.spring;

import static org.junit.Assert.assertTrue;

import com.zhang.spring.bean.Person;
import com.zhang.spring.springConfig.FirstConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
       private ApplicationContext context1 = new AnnotationConfigApplicationContext(FirstConfig.class);
    /**
     * 测试第一个FirstConfig
     */
    @Test
    public void test01(){
        Person person = context1.getBean("person",Person.class);
        System.out.println(person);
        String[] names = context1.getBeanNamesForType(Person.class);
        for (String name : names) {
            System.out.println(name);
        }
    }
}
