package com.zhang.spring;

import static org.junit.Assert.assertTrue;

import com.zhang.spring.bean.TestAware;
import com.zhang.spring.config.TestAwareConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private ApplicationContext context1=new AnnotationConfigApplicationContext(TestAwareConfig .class);
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void test01(){

        TestAware testAware = context1.getBean("testAware", TestAware.class);
        System.out.println(context1);
        System.out.println(testAware);

    }
}
