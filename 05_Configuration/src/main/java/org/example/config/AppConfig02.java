package org.example.config;

import org.example.bean.SpringBean02;
import org.springframework.context.annotation.Bean;

public class AppConfig02 {
    @Bean
    public SpringBean02 springBean2(){
        return new SpringBean02();
    }
}
