package org.example.config;

import org.example.bean.SpringBean01;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

@Configuration
@Import({AppConfig.class, AppConfig02.class})

/*//root path
@ImportResource("classpath:hibernate.xml")
//absolute path
@ImportResource("file:absolute-path-of-hibernate.xml")*/

public class AppConfig01 {
    @Bean
    public SpringBean01 springBean1(){
        return new SpringBean01();
    }
}
