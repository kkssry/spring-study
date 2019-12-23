package kr.co.softcampus.config;

import kr.co.softcampus.beans.*;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.*;

@Configuration
public class BeanConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    @Lazy
    public TestBean obj1() {
        return new TestBean();
    }

    @Bean
    @Lazy
    public TestBean2 obj2() {
        return new TestBean2();
    }

    @Bean
    public DataBean data1() {
        return new DataBean();
    }

    @Bean
    public DataBean2 data2() {
        return new DataBean2();
    }

    @Bean(autowire = Autowire.BY_NAME)
    public TestBean3 obj3() {
        return new TestBean3();
    }

    @Bean
    public TestBean4 obj4() {
        return new TestBean4();
    }

    @Bean
    public TestBean5 obj5() {
        return new TestBean5();
    }

    @Bean
    public TestBean6 obj6() {
        return new TestBean6();
    }

}
