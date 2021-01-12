package com.zhang.spring.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.spring.config
 * @date:2021/1/11
 */

@Configuration
@PropertySource({"classpath:/jdbc.properties"})
@ComponentScan({"com.zhang.spring"})
public class TestProfileConfig {

    @Value("${user}")
    private String user;
    @Value("${password}")
    private String password;
    @Value("${driverClassName}")
    private String driverClassName;

    @Profile("dataSourceDev")
    @Bean
    public DataSource dataSourceDev(){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/mp?useUnicode=true&characterEncoding=utf-8&allowMultiQueries=true");
        druidDataSource.setDriverClassName(driverClassName);
        druidDataSource.setUsername(user);
        druidDataSource.setPassword(password);
        System.out.println("dev");
        return druidDataSource;

    }
    @Profile("dataSourceTest")
    @Bean
    public DataSource dataSourceTest(){
        System.out.println("test");
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/book?useUnicode=true&characterEncoding=utf-8&allowMultiQueries=true");
        druidDataSource.setDriverClassName(driverClassName);
        druidDataSource.setUsername(user);
        druidDataSource.setPassword(password);
        return druidDataSource;

    }
    @Profile("dataSourceProd")
    @Bean
    public DataSource dataSourceProd(){
        System.out.println("prod");
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf-8&allowMultiQueries=true");
        druidDataSource.setDriverClassName(driverClassName);
        druidDataSource.setUsername(user);
        druidDataSource.setPassword(password);
        return druidDataSource;

    }
}
