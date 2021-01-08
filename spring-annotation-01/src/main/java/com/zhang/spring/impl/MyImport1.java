package com.zhang.spring.impl;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.spring.impl
 * @date:2021/1/8
 */
public class MyImport1 implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{"com.zhang.spring.component.Component3","com.zhang.spring.component.Component4"};
    }
}
