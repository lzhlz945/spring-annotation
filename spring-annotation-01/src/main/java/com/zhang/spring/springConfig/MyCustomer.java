package com.zhang.spring.springConfig;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.spring.springConfig
 * @date:2021/1/8
 */
public class MyCustomer implements TypeFilter {
    /**
     * 参数1：metadataReader获取当前正在扫描类的信息
     * 参数2：获取其他类任何信息
     */

    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {

        ClassMetadata classMetadata = metadataReader.getClassMetadata();
//        System.out.println("--->"+metadataReader.toString());
        if(classMetadata.getClassName().contains("ao")){
            return true;
        }
        return false;
    }
}
