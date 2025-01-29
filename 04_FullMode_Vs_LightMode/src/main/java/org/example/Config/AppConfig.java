package org.example.Config;

import org.example.bean.SpringBeanOne;
import org.example.bean.SpringBeanThree;
import org.example.bean.SpringBeanTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.bean")
public class AppConfig {
   /* @Bean
    public SpringBeanOne getSpringBeanOne(){
        SpringBeanTwo springBeanTwo = getSpringBeanTwo();
        SpringBeanTwo springBeanTwo1 = getSpringBeanTwo();
        return new SpringBeanOne();
    }

    @Bean
    public SpringBeanTwo getSpringBeanTwo(){
        return new SpringBeanTwo();
    }*/

/*    @Bean
    public SpringBeanTwo SpringBeanTwo(){
        SpringBeanThree springBeanThree1 = SpringBeanThree();
        SpringBeanThree springBeanThree2 = SpringBeanThree();
        return new SpringBeanTwo();
    }

    @Bean
    public SpringBeanThree SpringBeanThree(){
        return new SpringBeanThree();
    }*/
}
