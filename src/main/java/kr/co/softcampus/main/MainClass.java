package kr.co.softcampus.main;

import kr.co.softcampus.beans.*;
import kr.co.softcampus.config.BeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

    public static void main(String[] args) {
        System.out.println("=======================================");
        testJavaVer7();
        System.out.println("=======================================");
    }

//    private static void test7() {
//        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
//
//
//
//        ctx.close();
//    }

    private static void testJavaVer7() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);

        TestBean t1 = ctx.getBean(TestBean.class);
        System.out.printf("t1.data1 : %s\n", t1.getData1());
        System.out.printf("t1.data2 : %s\n", t1.getData2());
        System.out.printf("t1.data3 : %s\n", t1.getData3());
        System.out.printf("t1.data4 : %s\n", t1.getData4());
        System.out.printf("t1.data5 : %s\n", t1.getData5());

        System.out.println("=============================================");

        TestBean2 t2 = ctx.getBean(TestBean2.class);
        System.out.printf("t2.data1 %d\n", t2.getData1());
        System.out.printf("t2.data2 %s\n", t2.getData2());
        System.out.printf("t2.data3 %s\n", t2.getData3());
        System.out.printf("t2.data4 %s\n", t2.getData4());

        System.out.println("=============================================");

        TestBean3 java2 = ctx.getBean("java2", TestBean3.class);
        System.out.printf("java2.data1 %d\n", java2.getData1());
        System.out.printf("java2.data2 %s\n", java2.getData2());
        System.out.printf("java2.data3 %s\n", java2.getData3());
        System.out.printf("java2.data4 %s\n", java2.getData4());

        ctx.close();
    }


}
