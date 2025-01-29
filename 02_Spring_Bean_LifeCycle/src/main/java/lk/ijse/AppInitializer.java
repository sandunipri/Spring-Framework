package lk.ijse;

import lk.ijse.bean.MyConnection;
import lk.ijse.bean.SpringBean;
import lk.ijse.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

       /* SpringBean bean1 = context.getBean(SpringBean.class);
        SpringBean bean2 = context.getBean(SpringBean.class);

        System.out.println(bean1);
        System.out.println(bean2);

        MyConnection connection1 = context.getBean(MyConnection.class);
        System.out.println(connection1);

        MyConnection connection2 = context.getBean(MyConnection.class);
        System.out.println(connection2);*/

        MyConnection connection1 = context.getBean(MyConnection.class);
        System.out.println("-------------------------------------------------------------------------------------------");
        MyConnection connection2 = context.getBean(MyConnection.class);



        context.registerShutdownHook();

    }
}
