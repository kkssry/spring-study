package kr.co.softcampus.config;

import kr.co.softcampus.beans.*;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.*;

@Configuration
public class BeanConfig {

    @Bean
    public TestBean java1() {
        return new TestBean(200, "문자열2", new DataBean());
    }

    @Bean
    public TestBean java2() {
        TestBean t1 = new TestBean();
        t1.setIntData1(400);
        t1.setStringData2("문자열4");
        t1.setDataBean3(new DataBean());
        return t1;
    }

    @Bean
    public DataBean2 data11() {
        return new DataBean2();
    }

    @Bean
    public DataBean2 data22() {
        return new DataBean2();
    }

    @Bean(autowire = Autowire.BY_NAME)
    public TestBean2 java3() {
        return new TestBean2();
    }

    @Bean
    public DataBean3 data100() {
        return new DataBean3();
    }

    @Bean(autowire = Autowire.BY_TYPE)
    public TestBean3 java4() {
        return new TestBean3();
    }

    @Bean(name = "java600")
    @Lazy
    public TestBean java500() {
        TestBean t1 = new TestBean();
        return t1;
    }

    @Bean
    @Lazy
    @Primary
    public TestBean4 java5() {
        TestBean4 t4 = new TestBean4();
        return t4;
    }

}
