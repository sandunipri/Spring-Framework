package lk.ijse;


import lk.ijse.DI.Test02;
import lk.ijse.bean.Boy;
import lk.ijse.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

     /*   Boy boy = context.getBean(Boy.class);
        System.out.println(boy);

        boy.chatWithGirl();
*/

        Test02 test02 = context.getBean(Test02.class);
        test02.display();

        context.registerShutdownHook();
    }
}