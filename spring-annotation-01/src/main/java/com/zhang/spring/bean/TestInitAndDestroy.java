package com.zhang.spring.bean;

import lombok.Data;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.spring.bean
 * @date:2021/1/11
 */
@Data
public class TestInitAndDestroy {


    public TestInitAndDestroy() {
        System.out.println("TestInitAndDestroy无参构造....");
    }

    //初始方法
    public void init(){
        System.out.println("初始方法...");
    }

    //销毁方法
    public void destroy(){

        System.out.println("销毁方法...");
    }
}
