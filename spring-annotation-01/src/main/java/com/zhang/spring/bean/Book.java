package com.zhang.spring.bean;

import com.zhang.spring.dao.BookDao;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;
import javax.inject.Inject;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.spring.bean
 * @date:2021/1/11
 */
@Data
public class Book {

//  @Autowired(required = false)
//    @Qualifier("bookDao2")
//    @Resource
    @Inject
    private BookDao bookDao;
    private String bookName;
}
