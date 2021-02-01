package com.zhang.spring;

import static org.junit.Assert.assertTrue;

import com.zhang.spring.bean.TestAspects;
import com.zhang.spring.bean.TestAware;
import com.zhang.spring.config.TestAspects01;
import com.zhang.spring.config.TestAwareConfig;
import com.zhang.spring.config.TestProfileConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
//    private ApplicationContext context1=new AnnotationConfigApplicationContext(TestAwareConfig .class);
//    private ApplicationContext context2=new AnnotationConfigApplicationContext(TestProfileConfig  .class);
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    /*@Test
    public void test01(){

        TestAware testAware = context1.getBean("testAware", TestAware.class);
        System.out.println(context1);
        System.out.println(testAware);

    }*/


    @Test
    public void test02() throws SQLException {
        /**
         * this();
         * this.register(annotatedClasses);
         * this.refresh();
         */
        AnnotationConfigApplicationContext context2=new AnnotationConfigApplicationContext();
        Environment environment = context2.getEnvironment();
        ((ConfigurableEnvironment) environment).setActiveProfiles("dataSourceDev");
        context2.register(TestProfileConfig.class);
        context2.refresh();
//        DataSource  dataSource1 = (DataSource) context2.getBean("dataSourceDev");
//        DataSource  dataSource2 = (DataSource) context2.getBean("dataSourceTest");
//        DataSource  dataSource3= (DataSource) context2.getBean("dataSourceProd");

//        System.out.println(dataSource1.getConnection());
//        System.out.println(dataSource2.getConnection());
//        System.out.println(dataSource3.getConnection());


    }


    /**
     * 测试 aspects（数相除）
     */
    @Test
    public void test03(){

        ApplicationContext context=new AnnotationConfigApplicationContext(TestAspects01.class);
        TestAspects testAspects = context.getBean("testAspects", TestAspects.class);
        testAspects.division(1,1);
    }

}
