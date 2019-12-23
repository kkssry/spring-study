package kr.co.softcampus.main;

import kr.co.softcampus.beans.*;
import kr.co.softcampus.beans2.TestBean3;
import kr.co.softcampus.beans2.TestBean4;
import kr.co.softcampus.beans3.TestBean5;
import kr.co.softcampus.config.BeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainClass {

    public static void main(String[] args) {
        test6();
        System.out.println("=======================================");
        testJavaVer6();
        System.out.println("=======================================");
    }

    private static void test6() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        TestBean xml1 = ctx.getBean(TestBean.class);
        System.out.printf("xml1 : %s\n", xml1);

        TestBean2 xml2 = ctx.getBean("xml2", TestBean2.class);
        System.out.printf("xml2 : %s\n", xml2);

        TestBean2 xml3 = ctx.getBean("xml3", TestBean2.class);
        System.out.printf("xml3 : %s\n", xml3);

        TestBean3 xml4 = ctx.getBean(TestBean3.class);
        System.out.printf("xml4 : %s\n", xml4);

        TestBean4 xml5 = ctx.getBean("bean4", TestBean4.class);
        System.out.printf("xml5 : %s\n", xml5);

        TestBean4 xml100 = ctx.getBean("xml100", TestBean4.class);
        System.out.printf("xml100 : %s\n", xml100);

        TestBean4 xml200 = ctx.getBean("xml200", TestBean4.class);
        System.out.printf("xml200 : %s\n", xml200);

        TestBean5 xml500 = ctx.getBean(TestBean5.class);
        System.out.printf("xml500 : %s\n", xml500);


        ctx.close();
    }

    private static void testJavaVer6() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);

        TestBean java1 = ctx.getBean(TestBean.class);
        System.out.printf("java1 : %s\n", java1);

        TestBean2 java2 = ctx.getBean("java2", TestBean2.class);
        System.out.printf("java2 : %s\n", java2);

        TestBean2 java3 = ctx.getBean("java2", TestBean2.class);
        System.out.printf("java3 : %s\n", java3);

        TestBean3 java4 = ctx.getBean(TestBean3.class);
        System.out.printf("java4 : %s\n", java4);

        TestBean4 java5 = ctx.getBean("bean4", TestBean4.class);
        System.out.printf("java5 : %s\n", java5);

        TestBean4 java100 = ctx.getBean("java100", TestBean4.class);
        System.out.printf("java100 : %s\n", java100);

        TestBean4 java200 = ctx.getBean("java200", TestBean4.class);
        System.out.printf("java200 : %s\n", java200);

        TestBean5 java500 = ctx.getBean(TestBean5.class);
        System.out.printf("java500 : %s\n", java500);

        ctx.close();
    }


}
