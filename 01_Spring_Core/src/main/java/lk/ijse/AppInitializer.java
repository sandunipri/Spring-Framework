package lk.ijse;

import lk.ijse.bean.MyConnection;
import lk.ijse.bean.SpringBean;
import lk.ijse.bean.TestBean1;
import lk.ijse.bean.TestBean2;
import lk.ijse.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
/*
        //call getBean method to get the SpringBean object
        SpringBean bean = context.getBean(SpringBean.class);
        System.out.println("bean = " + bean);

        SpringBean bean1 = (SpringBean) context.getBean("springBean");
        System.out.println("bean1 = " + bean1);

        Object bean2 = context.getBean("springBean");
        System.out.println("bean2 = " + bean2);
        Runtime.getRuntime().addShutdownHook(new Thread(){
            @Override
            public void run(){
                System.out.println("System is shutting down");
                context.close();
            }

        });
        TestBean1 bean3 = context.getBean(TestBean1.class);
        System.out.println("bean3 = " + bean3);

        TestBean2 bean4 = (TestBean2) context.getBean("testBean2");
        System.out.println("bean4 = " + bean4);

        TestBean2 bean5 = context.getBean("bean2", TestBean2.class);
        System.out.println("bean5 = " + bean5);

        MyConnection connection = (MyConnection) context.getBean("connection");
        System.out.println("MyConnection = " + connection);

        MyConnection connection2 = context.getBean(MyConnection.class);
        System.out.println("MyConnection = " + connection2);*/



        /////////////////////////////////////////////////////////

/*        TestBean1 ref1 = context.getBean("testBean1", TestBean1.class);
        System.out.println(ref1);

        TestBean1 ref2 = context.getBean("testBean1", TestBean1.class);
        System.out.println(ref2);

        TestBean2 ref3 = context.getBean("testBean2", TestBean2.class);
        System.out.println(ref3);

        TestBean2 ref4 = context.getBean("testBean2", TestBean2.class);
        System.out.println(ref4);

        MyConnection connection1 = context.getBean("connection", MyConnection.class);
        System.out.println( connection1);

        MyConnection connection2 = context.getBean("connection", MyConnection.class);
        System.out.println( connection2);*/

        context.registerShutdownHook();

    }
}
