package com.zhang.spring.dao;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.spring.dao
 * @date:2021/1/11
 */
@Data
@Component
public class BookDao {
    private Integer lab=1;

    public BookDao() {
    }

    public BookDao(Integer lab) {
        this.lab = lab;
    }
}
