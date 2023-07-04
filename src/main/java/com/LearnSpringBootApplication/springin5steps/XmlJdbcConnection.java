package com.LearnSpringBootApplication.springin5steps;

/*
    This will be done via xml configuration
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE,
        proxyMode = ScopedProxyMode.TARGET_CLASS)
*/
public class XmlJdbcConnection {

    public XmlJdbcConnection() {
        System.out.println("XML JDBC Connection");
    }
}
