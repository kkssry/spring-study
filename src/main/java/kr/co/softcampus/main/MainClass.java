package kr.co.softcampus.main;

import kr.co.softcampus.beans.*;
import kr.co.softcampus.config.BeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainClass {

    public static void main(String[] args) {
        System.out.println("=======================================");
        testJavaVer5();
        System.out.println("=======================================");
    }

    private static void testJavaVer5() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);

        TestBean obj1 = ctx.getBean("obj1", TestBean.class);
        TestBean2 obj2 = ctx.getBean("obj2", TestBean2.class);

        System.out.println("-------------------------------------------------");

        TestBean3 obj3 = ctx.getBean("obj3", TestBean3.class);
        System.out.printf("obj3.data1 : %s\n", obj3.getData1());
        System.out.printf("obj3.data2 : %s\n", obj3.getData2());

        System.out.println("-------------------------------------------------");

        TestBean4 obj4 = ctx.getBean("obj4", TestBean4.class);
        System.out.printf("obj4.data1 : %s\n", obj4.getData1());
        System.out.printf("obj4.data2 : %s\n", obj4.getData2());

        System.out.println("-------------------------------------------------");

        TestBean5 obj5 = ctx.getBean("obj5", TestBean5.class);
        System.out.printf("obj5.data1 : %s\n", obj5.getData1());
        System.out.printf("obj5.data2 : %s\n", obj5.getData2());

        System.out.println("-------------------------------------------------");

        TestBean6 obj6 = ctx.getBean("obj6", TestBean6.class);
        System.out.printf("obj6.data100 : %s\n", obj6.getData100());
        System.out.printf("obj6.data200 : %s\n", obj6.getData200());

        ctx.close();
    }





}
