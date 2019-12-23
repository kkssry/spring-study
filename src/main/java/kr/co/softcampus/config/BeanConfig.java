package kr.co.softcampus.config;

import kr.co.softcampus.beans.*;
import kr.co.softcampus.beans2.TestBean4;
import org.springframework.context.annotation.*;

@Configuration
//지정된 패키지의 Bean 클래스들의 어노테이션을 분석하여 Bean 등록 지정
@ComponentScan(basePackages = {"kr.co.softcampus.beans2","kr.co.softcampus.beans3"})
public class BeanConfig {

    @Bean
    public TestBean java1(){
        return new TestBean();
    }

    @Bean
    public TestBean2 java2() {
        return new TestBean2();
    }

    @Bean
    public TestBean2 java3() {
        return new TestBean2();
    }

    @Bean
    public TestBean4 java100() {
        return new TestBean4();
    }

    @Bean
    public TestBean4 java200() {
        return new TestBean4();
    }

}
