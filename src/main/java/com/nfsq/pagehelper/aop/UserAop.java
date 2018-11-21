package com.nfsq.pagehelper.aop;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nfsq.pagehelper.persist.dao.User;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
public class UserAop {
    @Pointcut("execution(public * com.nfsq.pagehelper.service.impl.*.*(..))")
    public void myPointCut(){}

    @Around("myPointCut()")
    public PageInfo<User> around(ProceedingJoinPoint proceedingJoinPoint){
        PageInfo<User> pageInfo = null;
        try{
            Object[] args = proceedingJoinPoint.getArgs();
            PageHelper.startPage((Integer)args[0],(Integer)args[1]);
            Object object = proceedingJoinPoint.proceed();
            pageInfo = new PageInfo<User>((List<User>) object);
        }catch (Throwable e){
            e.printStackTrace();
        }

        return pageInfo;
    }
}
