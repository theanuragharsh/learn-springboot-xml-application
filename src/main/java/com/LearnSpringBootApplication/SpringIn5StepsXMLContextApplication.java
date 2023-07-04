package com.LearnSpringBootApplication;

import com.LearnSpringBootApplication.springin5steps.XmlPersonDao;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan(value = "com.LearnSpringBootApplication.springin5steps")
public class SpringIn5StepsXMLContextApplication {

    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")) {
            XmlPersonDao xmlPersonDao = applicationContext.getBean(XmlPersonDao.class);
            System.out.println(xmlPersonDao);
            System.out.println(xmlPersonDao.getXmlJdbcConnection());
            System.out.println(xmlPersonDao.getRestTemplateImpl());
        }
    }
}
