package hello.core.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("hello.core.test")
public class Test {

    public static void main(String[] args) {
        new Test().test();
    }

    public void test() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Test.class);

        MySingletonBean bean1 = ac.getBean(MySingletonBean.class);
        MySingletonBean bean2 = ac.getBean(MySingletonBean.class);
        MyPrototypeBean prototypeBean = ac.getBean(MyPrototypeBean.class);

        System.out.println(bean1);
        System.out.println(bean2);

        bean1.doSomething();
        bean2.doSomething();
    }
}