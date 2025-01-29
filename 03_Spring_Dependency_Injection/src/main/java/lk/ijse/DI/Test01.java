package lk.ijse.DI;

import org.springframework.stereotype.Component;

@Component
public class Test01 implements DI {
    public Test01() {
        System.out.println("Test01 Instantiated");
    }

    @Override
    public void SayHello() {
        System.out.println("Hello Spring");
    }
}
