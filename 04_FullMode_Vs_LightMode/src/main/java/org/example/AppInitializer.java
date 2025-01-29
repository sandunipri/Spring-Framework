package org.example;

import org.example.Config.AppConfig;
import org.example.bean.SpringBeanOne;
import org.example.bean.SpringBeanTwo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        /*SpringBeanOne springBeanOne = context.getBean(SpringBeanOne.class);
        System.out.println("springBeanOne = " + springBeanOne);

        SpringBeanOne springBeanOne1 = context.getBean(SpringBeanOne.class);
        System.out.println("springBeanOne1 = " + springBeanOne1);


        SpringBeanTwo springBeanTwo = context.getBean(SpringBeanTwo.class);
        System.out.println("springBeanTwo = " + springBeanTwo);

        SpringBeanTwo springBeanTwo1 = context.getBean(SpringBeanTwo.class);
        System.out.println("springBeanTwo1 = " + springBeanTwo1);*/

        SpringBeanTwo bean01 = context.getBean(SpringBeanTwo.class);
        System.out.println("bean01 = " + bean01);

        SpringBeanTwo bean02 = context.getBean(SpringBeanTwo.class);
        System.out.println("bean02 = " + bean02);
        context.registerShutdownHook();
    }
}
