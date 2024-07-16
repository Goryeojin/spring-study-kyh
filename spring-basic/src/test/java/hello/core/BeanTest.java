package hello.core;

import hello.core.test.MyPrototypeBean;
import hello.core.test.MySingletonBean;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericApplicationContext;

@Configuration
@ComponentScan("hello.core.test")
public class BeanTest {

    @Test
    public void test() {

        // AnnotationConfigApplicationContext를 생성합니다.
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(BeanTest.class);


        MySingletonBean bean1 = ac.getBean(MySingletonBean.class);
        MySingletonBean bean2 = ac.getBean(MySingletonBean.class);
        MyPrototypeBean prototypeBean = ac.getBean(MyPrototypeBean.class);

        System.out.println(bean1);
        System.out.println(bean2);

        bean1.doSomething();
        bean2.doSomething();
    }
}
