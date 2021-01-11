package com.zhang.spring.impl;

import com.zhang.spring.bean.TestFactoryBean;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.spring.impl
 * @date:2021/1/11
 */
public class MyFactoryBean implements FactoryBean<TestFactoryBean> {
    @Override
    public TestFactoryBean getObject() throws Exception {

        return new TestFactoryBean();
    }

    @Override
    public Class<?> getObjectType() {
        return TestFactoryBean.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
