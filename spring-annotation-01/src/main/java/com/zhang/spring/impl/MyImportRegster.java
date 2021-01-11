package com.zhang.spring.impl;

import com.zhang.spring.bean.Rainbow;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.spring.impl
 * @date:2021/1/11
 */
public class MyImportRegster implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {

        Boolean red=beanDefinitionRegistry.containsBeanDefinition("red");
        Boolean blue=beanDefinitionRegistry.containsBeanDefinition("blue");
        if(red && blue){
            RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(Rainbow.class);
            beanDefinitionRegistry.registerBeanDefinition("com.zhang.spring.bean.Rainbow",rootBeanDefinition);
            System.out.println("Rainbow被加载到容器了。。。");
        }

    }
}
