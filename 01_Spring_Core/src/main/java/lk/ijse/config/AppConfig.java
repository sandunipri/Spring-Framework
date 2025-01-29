package lk.ijse.config;

import lk.ijse.bean.MyConnection;
import lk.ijse.bean.SpringBean;
import lk.ijse.bean.TestBean1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "lk.ijse.bean")
/*@ComponentScan(basePackageClasses = {SpringBean.class, TestBean1.class})*/
public class AppConfig {

        @Bean("connection")
        @Scope("prototype")
        MyConnection getConnection (){
        return new MyConnection();
        };
}
