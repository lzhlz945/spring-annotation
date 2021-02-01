package com.zhang.spring.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.spring.aspects
 * @date:2021/1/12
 */
@Aspect
public class DivAspects {

    @Pointcut(value = "execution(* com.zhang.spring.bean.*.*(..))")
    public void pointCut(){

    }

    @Before("pointCut()")
    public void getParameters(JoinPoint joinPoint){

        System.out.println("参数："+"{"+ Arrays.toString(joinPoint.getArgs()) +"}");

    }

    //JoinPoint joinPoint必须写在前面
    @AfterReturning(value = "pointCut()",returning ="result" )
    public void getResult(JoinPoint joinPoint,Object result){
        System.out.println(""+joinPoint.getSignature().getName()+"相除的结果："+"{"+result+"}");
    }

    @AfterThrowing(value = "pointCut()",throwing = "e")
    public void getException(Exception e){
        System.out.println("打印异常："+e);
    }

    @After("pointCut()")
    public void finally1(JoinPoint joinPoint){
        System.out.println("\"+joinPoint.getSignature().getName()+\"执行完成....");
    }

    @Around("pointCut()")
    public Object proxy1(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("通知前");
        Signature signature = joinPoint.getSignature();
        String name = signature.getName();
        Object[] args = joinPoint.getArgs();

        System.out.println(name+args.toString());

        Object proceed = joinPoint.proceed();
        System.out.println("通知后");
        int modifiers = signature.getModifiers();
        System.out.println(modifiers);



        return proceed;


    }
}
