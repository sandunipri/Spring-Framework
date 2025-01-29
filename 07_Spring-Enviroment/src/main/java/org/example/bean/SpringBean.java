package org.example.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean implements InitializingBean {

    @Value("${os.name}")
    private String osName;

    @Value("${USERDOMAIN}")
    private String logName;

    @Value("${database_user}")
    private String dbUser;

    @Value("${db_URL}")
    private String dbURL;

    @Value("${user}")
    private String user;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("osName = " + osName);
        System.out.println("logName = " + logName);
        System.out.println("dbUser = " + dbUser);
        System.out.println("dbURL = " + dbURL);
        System.out.println("user = " + user);
    }
}
