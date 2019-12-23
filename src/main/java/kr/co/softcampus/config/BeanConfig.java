package kr.co.softcampus.config;

import kr.co.softcampus.beans.*;
import kr.co.softcampus.beans2.TestBean4;
import org.springframework.context.annotation.*;

@Configuration
//지정된 패키지의 Bean 클래스들의 어노테이션을 분석하여 Bean 등록 지정
@ComponentScan(basePackages = "kr.co.softcampus.beans")
public class BeanConfig {

    @Bean
    public DataBean3 obj4() {
        return new DataBean3();
    }

    @Bean
    public DataBean3 obj5() {
        return new DataBean3();
    }

    @Bean
    public TestBean3 java2() {
        return new TestBean3(200, "문자열2", new DataBean4(), new DataBean5());
    }

}
