package kr.co.softcampus.main;

import kr.co.softcampus.beans.*;
import kr.co.softcampus.config.BeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainClass {

    public static void main(String[] args) {
        test10();
        System.out.println("=======================================");
        testJavaVer4();
        System.out.println("=======================================");
    }

    private static void test10() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        TestBean xml1 = ctx.getBean("xml1", TestBean.class);
        System.out.printf("xml1.data1 : %d\n", xml1.getData1());
        System.out.printf("xml1.data2 : %s\n", xml1.getData2());
        System.out.printf("xml1.data3 : %s\n", xml1.getData3());
        System.out.printf("xml1.data4 : %s\n", xml1.getData4());
        System.out.printf("xml1.data5 : %s\n", xml1.getData5());
        System.out.printf("xml1.data6 : %s\n", xml1.getData6());

        TestBean2 xml2 = ctx.getBean("xml2", TestBean2.class);
        System.out.printf("xml2.data1 : %d\n", xml2.getData());
        System.out.printf("xml2.data2 : %s\n", xml2.getData2());
        System.out.printf("xml2.data3 : %s\n", xml2.getData3());
        System.out.printf("xml2.data4 : %s\n", xml2.getData3());

        ctx.close();
    }

    private static void testJavaVer4() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);

        TestBean java1 = ctx.getBean("java1", TestBean.class);
        System.out.printf("java1.data1 : %d\n", java1.getData1());
        System.out.printf("java1.data2 : %s\n", java1.getData2());
        System.out.printf("java1.data3 : %s\n", java1.getData3());
        System.out.printf("java1.data4 : %s\n", java1.getData4());
        System.out.printf("java1.data5 : %s\n", java1.getData5());
        System.out.printf("java1.data6 : %s\n", java1.getData6());

        TestBean2 java2 = ctx.getBean("java2", TestBean2.class);
        System.out.printf("java2.getData1 : %d\n", java2.getData());
        System.out.printf("java2.getData2 : %s\n", java2.getData2());
        System.out.printf("java2.getData3 : %s\n", java2.getData3());
        System.out.printf("java2.getData4 : %s\n", java2.getData4());

        ctx.close();

    }


}
