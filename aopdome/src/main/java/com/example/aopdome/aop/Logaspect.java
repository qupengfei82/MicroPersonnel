package com.example.aopdome.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logaspect {
//定义一个切点
    @Pointcut("execution(* com.example.aopdome.service.*.*(..))")
    public void pc1(){

    }
    // 后置通知
    @After(value = "pc1()")
    public void after(JoinPoint jp) {

        String name = jp.getSignature().getName();
        System.out.println(name + "方法执行结束...");
    }
}
