package kr.co.softcampus.main;

import kr.co.softcampus.beans.*;
import kr.co.softcampus.config.BeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

    public static void main(String[] args) {
        test7();
        System.out.println("=======================================");
        System.out.println("=======================================");
    }

    private static void test7() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        TestBean xml1 = ctx.getBean("xml1", TestBean.class);
        int a1 = xml1.method1();
        System.out.println("a1 : " + a1);

        ctx.close();
    }

    private static void testJavaVer7() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);



        ctx.close();
    }


}
