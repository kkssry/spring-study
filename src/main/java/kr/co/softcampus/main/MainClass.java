package kr.co.softcampus.main;

import kr.co.softcampus.beans.*;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;


public class MainClass {
    public static void main(String[] args) {
        test6();
    }

    private static void test6() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        TestBean obj11 = ctx.getBean("obj11", TestBean.class);
        System.out.printf("obj11.data11 : %s\n", obj11.getData11());
        System.out.printf("obj11.data22 : %s\n", obj11.getData22());

        System.out.println("-----------------------------------------------");

        TestBean obj22 = ctx.getBean("obj22", TestBean.class);
        System.out.printf("obj22.data11 : %s\n", obj22.getData11());
        System.out.printf("obj22.data22 : %s\n", obj22.getData22());

        System.out.println("--------------------------------------------");
        TestBean2 obj33 = ctx.getBean("obj33", TestBean2.class);
        System.out.printf("obj33.data11 : %s\n", obj33.getData11());
        System.out.printf("obj33.data22 : %s\n", obj33.getData22());

        System.out.println("--------------------------------------------");
        TestBean3 obj44 = ctx.getBean("obj44", TestBean3.class);
        System.out.printf("obj44.data11 : %s\n", obj44.getData11());
        System.out.printf("obj44.data22 : %s\n", obj44.getData22());
        System.out.printf("obj44.data33 : %s\n", obj44.getData33());
        System.out.printf("obj44.data44 : %s\n", obj44.getData44());

        System.out.println("--------------------------------------------");
        TestBean3 obj55 = ctx.getBean("obj55", TestBean3.class);
        System.out.printf("obj55.data11 : %s\n", obj55.getData11());
        System.out.printf("obj55.data22 : %s\n", obj55.getData22());
        System.out.printf("obj55.data33 : %s\n", obj55.getData33());
        System.out.printf("obj55.data44 : %s\n", obj55.getData44());

        System.out.println("--------------------------------------------");
        TestBean3 obj66 = ctx.getBean("obj66", TestBean3.class);
        System.out.printf("obj66.data11 : %s\n", obj66.getData11());
        System.out.printf("obj66.data22 : %s\n", obj66.getData22());
        System.out.printf("obj66.data33 : %s\n", obj66.getData33());
        System.out.printf("obj66.data44 : %s\n", obj66.getData44());

        System.out.println("--------------------------------------------");
        TestBean3 obj77 = ctx.getBean("obj77", TestBean3.class);
        System.out.printf("obj77.data11 : %s\n", obj77.getData11());
        System.out.printf("obj77.data22 : %s\n", obj77.getData22());
        System.out.printf("obj77.data33 : %s\n", obj77.getData33());
        System.out.printf("obj77.data44 : %s\n", obj77.getData44());

        System.out.println("--------------------------------------------");
        TestBean obj88 = ctx.getBean("obj88", TestBean.class);
        System.out.printf("obj88.data11 : %s\n", obj88.getData11());
        System.out.printf("obj88.data22 : %s\n", obj88.getData22());

        System.out.println("--------------------------------------------");
        TestBean obj99 = ctx.getBean("obj99", TestBean.class);
        System.out.printf("obj99.data11 : %s\n", obj99.getData11());
        System.out.printf("obj99.data22 : %s\n", obj99.getData22());


        ctx.close();

    }

    public static void test5() {
//        TestBean obj1 = new TestBean();
//        obj1.setData1(100);
//        System.out.printf("obj1.data1 : %s\n", obj1.getData1());

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        TestBean t11 = ctx.getBean("t11", TestBean.class);

        List<String> list = t11.getList1();
        for (String s : list) {
            System.out.printf("list1 : %s\n", s);
        }

        List<Integer> list2 = t11.getList2();
        for (Integer integer : list2) {
            System.out.printf("list2 : %d\n", integer);
        }

        List<DataBean> list3 = t11.getList3();
        for (DataBean dataBean : list3) {
            System.out.printf("list3 : %s\n", dataBean);

        }

        System.out.println("-------------------------------------");

        Set<String> set1 = t11.getSet1();
        Set<Integer> set2 = t11.getSet2();
        Set<DataBean> set3 = t11.getSet3();

        for (String s : set1) {
            System.out.printf("set1 : %s\n", s);
        }

        for (Integer integer : set2) {
            System.out.printf("set2 : %d\n", integer);
        }

        for (DataBean dataBean : set3) {
            System.out.printf("set3 : %s\n", dataBean);
        }

        System.out.println("-----------------------------------------");

        Map<String,Object> map1 = t11.getMap1();
        String a1 = (String) map1.get("a1");
        int a2 = (Integer) map1.get("a2");
        DataBean a3 = (DataBean) map1.get("a3");
        DataBean a4 = (DataBean) map1.get("a4");
        List<String> a5 = (List<String>) map1.get("a5");

        System.out.printf("a1 : %s\n", a1);
        System.out.printf("a2 : %d\n", a2);
        System.out.printf("a3 : %s\n", a3);
        System.out.printf("a4 : %s\n", a4);

        for (String s : a5) {
            System.out.printf("a5 : %s\n", s);
        }

        System.out.println("-------------------------------------");

        Properties prop1 = t11.getProp1();

        String p1 = prop1.getProperty("p1");
        String p2 = prop1.getProperty("p2");
        String p3 = prop1.getProperty("p3");

        System.out.printf("p1 : %s\n", p1);
        System.out.printf("p2 : %s\n", p2);
        System.out.printf("p3 : %s\n", p3);


        ctx.close();
    }

    public static void test4() {
        TestBean obj1 = new TestBean();
        obj1.setData1(100);
        System.out.printf("obj1.data1 : %s\n", obj1.getData1());

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        TestBean t1 = ctx.getBean("t1", TestBean.class);
        System.out.printf("t1.data1 : %d\n", t1.getData1());
        System.out.printf("t1.data2 : %f\n", t1.getData2());
        System.out.printf("t1.data3 : %s\n", t1.getData3());
        System.out.printf("t1.data4 : %s\n", t1.isData4());
        System.out.printf("t1.data5 : %s\n", t1.getData5());
        System.out.printf("t1.data6 : %s\n", t1.getData6());

        ctx.close();
    }

    public static void test3() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        TestBean obj1 = ctx.getBean("obj1", TestBean.class);
        obj1.printData();
        System.out.println("-------------------------------------------");

        TestBean obj2 = ctx.getBean("obj2", TestBean.class);
        obj2.printData();
        System.out.println("-------------------------------------------");

        TestBean obj3 = ctx.getBean("obj3", TestBean.class);
        obj3.printData();
        System.out.println("-------------------------------------------");

        TestBean obj4 = ctx.getBean("obj4", TestBean.class);
        obj4.printData();
        System.out.println("-------------------------------------------");

        TestBean obj6 = ctx.getBean("obj6", TestBean.class);
        obj6.printData();
        System.out.println("-------------------------------------------");

        TestBean obj7 = ctx.getBean("obj7", TestBean.class);
        obj7.printData();
        System.out.println("-------------------------------------------");

        TestBean2 obj8 = ctx.getBean("obj8", TestBean2.class);
        obj8.printData();
        System.out.println("-------------------------------------------");

        TestBean2 obj9 = ctx.getBean("obj9", TestBean2.class);
        obj9.printData();
        System.out.println("-------------------------------------------");

        ctx.close();
    }


    public static void test2() {
        ClassPathResource res = new ClassPathResource("beans.xml");
        XmlBeanFactory factory = new XmlBeanFactory(res);

        TestBean t1 = factory.getBean("t1", TestBean.class);
        System.out.printf("t1 : %s\n", t1);

        TestBean t2 = factory.getBean("t1", TestBean.class);
        System.out.printf("t2 : %s\n", t2);
    }


    public static void callMethod(HelloWorld hello) {
        hello.sayHello();
    }
}
