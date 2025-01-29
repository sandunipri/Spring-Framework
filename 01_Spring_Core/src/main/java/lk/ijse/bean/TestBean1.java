package lk.ijse.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TestBean1 {
    public TestBean1(){
        System.out.println("TestBean1 object created");
    }
}
