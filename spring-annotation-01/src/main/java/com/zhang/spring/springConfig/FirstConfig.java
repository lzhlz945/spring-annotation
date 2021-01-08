package com.zhang.spring.springConfig;

import com.zhang.spring.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.spring.springConfig
 * @date:2021/1/8
 */
@Configuration
//指定排除规则
/**
 * 参数解释：1：basePackages包扫描
 *          2：excludeFilters 排除扫描
 *          3：@ComponentScan.Filter
 *          3.1：filter类型(
 *          ANNOTATION(默认),ASSIGNABLE_TYPE,ASPECTJ,REGEX,CUSTOM;
 *          )
 *          3.2：classes 不包含的注解类
* */
/*@ComponentScan(basePackages = {"com.zhang.spring"},excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {
                Controller.class, Service.class
        })
})*/
@ComponentScan(basePackages = {"com.zhang.spring"},includeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {
                Service.class
        })
},useDefaultFilters = false)
public class FirstConfig {

    @Bean
    public Person person1(){
        return new Person("zs",20);
    }

}
