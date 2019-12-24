package kr.co.softcampus.advisor;

import org.aspectj.lang.ProceedingJoinPoint;

public class AdvisorClass {

    public void beforeMethod1() {
        System.out.println("BeforeMethod 호출");
    }

    public void afterMethod() {
        System.out.println("afterMethod 호출");
    }

    public Object aroundMethod(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("aroundMethod 호출 1 ");

        // 원래의 메서드를 호출
        Object obj = pjp.proceed();

        System.out.println("aroundMethod 호출 2");

        return obj;
    }

    public void afterReturningMethod() {
        System.out.println("afterReturningMethod 호출");
    }

    public void afterThrowingMethod(Throwable e1) {
        System.out.println("afterThrowingMethod 호출");
        System.out.println(e1);
    }
}
