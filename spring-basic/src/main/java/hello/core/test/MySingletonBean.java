package hello.core.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MySingletonBean {
    private MyPrototypeBean prototypeBean;

    @Autowired
    public void setPrototypeBean(MyPrototypeBean prototypeBean) {
        this.prototypeBean = prototypeBean;
    }

    public void doSomething() {
        // MyPrototypeBean을 사용하는 로직
        MyPrototypeBean myPrototypeBean = prototypeBean;
        System.out.println(myPrototypeBean.getName());
    }
}