package org.example.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean implements InitializingBean {

/*     @Autowired(required = false)
    public SpringBean(@Value("sanduni") String name,@Value("1") int id,@Value("true") boolean isActive) {
        System.out.println("Spring Bean Object Created...");
        System.out.println("Name: " + name);
        System.out.println("id: " + id);
    }
    @Autowired(required = false)
    public SpringBean(@Value("sanduniiiiiiiii") String name,@Value("1") int id) {
        System.out.println("Spring Bean Object Created...");
        System.out.println("Name: " + name);
        System.out.println("id: " + id);
    }*/

    @Value("sanduni")
    private String name;

    public SpringBean(){
        System.out.println("name: " + name);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("name: " + name);
    }
}
