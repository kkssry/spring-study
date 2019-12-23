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



        ctx.close();
    }

    private static void testJavaVer4() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);



        ctx.close();

    }

    private static void test9() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        TestBean xml1 = ctx.getBean("xml1", TestBean.class);
        System.out.printf("xml1.getIntData1 : %d\n", xml1.getIntData1());
        System.out.printf("xml1.getStringData2 : %s\n", xml1.getStringData2());
        System.out.printf("xml1.getDataBean3 : %s\n", xml1.getDataBean3());

        System.out.println("--------------------------------------------------------");

        TestBean xml11 = ctx.getBean("xml11", TestBean.class);
        System.out.printf("xml11.getIntData : %d\n", xml11.getIntData1());
        System.out.printf("xml11.getStringData2 : %s\n", xml11.getStringData2());
        System.out.printf("xml11.getDataBean3 : %s\n", xml11.getDataBean3());

        System.out.println("-----------------------------------------------------------");
        TestBean2 xml3 = ctx.getBean("xml3", TestBean2.class);
        System.out.printf("xml3.getData11 : %s\n", xml3.getData11());
        System.out.printf("xml3.getData22 : %s\n", xml3.getData22());

        System.out.println("-----------------------------------------------------------");
        TestBean3 xml4 = ctx.getBean("xml4", TestBean3.class);
        System.out.printf("xml4.getData1 : %s\n", xml4.getData1());
        System.out.printf("xml4.getData2 : %s\n", xml4.getData2());

        ctx.close();
    }

    private static void testJavaVer3() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);

        TestBean java1 = ctx.getBean("java1", TestBean.class);
        System.out.printf("java1.getIntData1 : %d\n", java1.getIntData1());
        System.out.printf("java1.getStringData2 : %s\n", java1.getStringData2());
        System.out.printf("java1.getDataBean3 : %s\n", java1.getDataBean3());

        System.out.println("-----------------------------------------------------");

        TestBean java2 = ctx.getBean("java2", TestBean.class);
        System.out.printf("java2.getIntData1 : %d\n", java2.getIntData1());
        System.out.printf("java2.getStringData2 : %s\n", java2.getStringData2());
        System.out.printf("java2.getDataBean3 : %s\n", java2.getDataBean3());

        System.out.println("-----------------------------------------------------");

        TestBean2 java3 = ctx.getBean("java3", TestBean2.class);
        System.out.printf("java3.getData11 : %s\n", java3.getData11());
        System.out.printf("java3.getData22 : %s\n", java3.getData22());

        System.out.println("-----------------------------------------------------");

        TestBean3 java4 = ctx.getBean("java4", TestBean3.class);
        System.out.printf("java4.getData1 : %s\n", java4.getData1());
        System.out.printf("java4.getData2 : %s\n", java4.getData2());

        ctx.close();
    }

}
