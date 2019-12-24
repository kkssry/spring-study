package kr.co.softcampus.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class TestBean {

    public int method1() {
        System.out.println("method1 호출");

//        int b = 100 /0;

        return 100;
    }


}
