package org.example.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanOne implements BeanNameAware , ApplicationContextAware {
    @Bean
    public SpringBeanTwo getSpringBeanTwo(){
        SpringBeanThree springBeanThree1 = getSpringBeanThree();
        SpringBeanThree springBeanThree2 = getSpringBeanThree();

        System.out.println("springBeanThree1 "+springBeanThree1);
        System.out.println("springBeanThree2 "+springBeanThree2);

        return new SpringBeanTwo();
    }
    @Bean
    public SpringBeanThree getSpringBeanThree(){
        return new SpringBeanThree();
    }


    @Override
    public void setBeanName(String name) {
        System.out.println("SpringBeanOne Bean Name : "+name);
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("SpringBeanOne Application Context : "+applicationContext);
    }
}
