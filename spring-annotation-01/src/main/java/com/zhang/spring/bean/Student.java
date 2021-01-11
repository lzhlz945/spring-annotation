package com.zhang.spring.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.spring.bean
 * @date:2021/1/11
 */
@Data
public class Student {
    @Value("${test.name}")
    private String name;
    @Value("#{18-1}")
    private Integer age;
}
