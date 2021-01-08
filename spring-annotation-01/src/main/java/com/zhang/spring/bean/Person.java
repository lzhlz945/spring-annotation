package com.zhang.spring.bean;

import lombok.Data;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.spring.bean
 * @date:2021/1/8
 */
@Data
public class Person {
    private String name;
    private Integer age;

    public Person(){

    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
