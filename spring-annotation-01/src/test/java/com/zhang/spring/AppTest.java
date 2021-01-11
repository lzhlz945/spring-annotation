package com.zhang.spring;

import static org.junit.Assert.assertTrue;

import com.zhang.spring.bean.*;
import com.zhang.spring.impl.MyFactoryBean;
import com.zhang.spring.springConfig.*;
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
       private ApplicationContext context2 = new AnnotationConfigApplicationContext(CustomerConfig.class);
       private ApplicationContext context3 = new AnnotationConfigApplicationContext(ConditionalConfig.class);
       private ApplicationContext context4 = new AnnotationConfigApplicationContext(ImportConfig.class);
       private ApplicationContext context6 = new AnnotationConfigApplicationContext(ValueConfig .class);
       private ApplicationContext context7 = new AnnotationConfigApplicationContext(AtowierConfig  .class);
       private AnnotationConfigApplicationContext context5 = new AnnotationConfigApplicationContext(FactoryBeanConfig.class);
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

    /**
     * 测试ImportSelector,返回的是全类名的类的数组，来注入到容器中
     */
    @Test
    public void test06(){
        String[] beanDefinitionNames = context4.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }

    }

    /**
     * 测试factoryBean,返回的类型和配置的不一致
     */
    @Test
    public void test07(){

        Object myFactoryBean = context5.getBean("myFactoryBean");
        TestInitAndDestroy  testInitAndDestroy = context5.getBean("testInitAndDestroy", TestInitAndDestroy.class);
        System.out.println(testInitAndDestroy);
        System.out.println(myFactoryBean.getClass());
        context5.close();

    }

    /**
     * 测试给bean的属性赋值的三种方式
     * 1、value("xx")
     * 2、value("#{xx}")
     * 2、value("${xx}")
     */
    @Test
    public void test08(){

        Student student = context6.getBean("student", Student.class);
        Environment environment = context6.getEnvironment();
        String s1 = environment.getProperty("test.name");
        System.out.println(s1);
        System.out.println(student);

    }

    /**
     * 测试Autowired 自动装配
     */
    @Test
    public void test09(){

        Book book = context7.getBean("book", Book.class);
        System.out.println(book);

    }
}
