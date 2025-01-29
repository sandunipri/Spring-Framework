package org.example.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringBean implements BeanNameAware , BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public SpringBean() {
        System.out.println("Spring Bean Object Created...");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean Factory Aware...");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean Name Aware...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean Destroyed...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean Initialized...");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application Context Aware...");
    }
}
