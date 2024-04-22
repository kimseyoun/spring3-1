package kr.hs.study.advisor;

import org.aspectj.lang.ProceedingJoinPoint;

public class AdviceClass1 {
    public void before(){
        System.out.println("before Method");
    }
    public void afterReturn(){
        System.out.println("after Method");
    }
    public void afterThrowing(Throwable e){
        System.out.println("예외발생시 실행되는 메서드");
        System.out.println(e);
    }
    public void aroundMethod(ProceedingJoinPoint pjp) throws Throwable{
        System.out.println("around 메서드");
        pjp.proceed();
        System.out.println("around 메서드");
    }
}
