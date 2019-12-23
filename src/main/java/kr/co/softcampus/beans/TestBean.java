package kr.co.softcampus.beans;

public class TestBean {

    public TestBean() {
        System.out.println("TestBean의 생성자 입니다.");
    }

    public void init() {
        System.out.println("TestBean의 ini");
    }

    public void destroy() {
        System.out.println("TestBean의 destroy");
    }

}
