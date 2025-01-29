package lk.ijse.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MyConnection implements BeanNameAware , BeanFactoryAware , ApplicationContextAware , InitializingBean , DisposableBean{
   public MyConnection(){
        System.out.println("MyConnection object created");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("MyConnection Bean Name : "+name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("MyConnection Bean Factory : "+beanFactory);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("MyConnection Application Context : "+applicationContext);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("MyConnection object is going to be initialized");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("MyConnection object is going to be destroyed");
    }
}
