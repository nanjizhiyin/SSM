package com.xpfirst.hdrRouter.aop;

import org.aspectj.lang.annotation.Pointcut;

public class PointCuts {
    @Pointcut(value = "within(com.xpfirst.hdrRouter.service.UserService)")
    public void aopDemo() {
        System.out.print("fasdfasfafdasfd");
    }
}
