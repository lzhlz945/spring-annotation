package com.zhang.spring.springConfig;

import com.zhang.spring.bean.Book;
import com.zhang.spring.dao.BookDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.spring.springConfig
 * @date:2021/1/11
 */
@Configuration
@ComponentScan({"com.zhang.spring"})
public class AtowierConfig {

    @Bean
    public Book book(){
        return new Book();
    }

    @Bean("bookDao2")
    @Primary
    public BookDao bookDao(){
        return new BookDao(2);
    }
}
