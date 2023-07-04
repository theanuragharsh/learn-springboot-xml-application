package com.LearnSpringBootApplication;

import com.LearnSpringBootApplication.springin5steps.XmlPersonDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
No need of annotations here as it is being configured using xml file in applicationContext.xml
@Configuration
@ComponentScan(value = "com.LearnSpringBootApplication.springin5steps")
*/
public class SpringIn5StepsXMLContextApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsXMLContextApplication.class);

    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")) {
            XmlPersonDao xmlPersonDao = applicationContext.getBean(XmlPersonDao.class);
            LOGGER.info("Beans Loaded -> {}", (Object) applicationContext.getBeanDefinitionNames());
            LOGGER.info("{} {} {}", xmlPersonDao, xmlPersonDao.getXmlJdbcConnection(), xmlPersonDao.getRestTemplateImpl());
        }
    }
}
