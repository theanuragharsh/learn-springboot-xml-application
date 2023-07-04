package com.LearnSpringBootApplication.springin5steps;

/* This will be done via xml
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
*/
public class XmlPersonDao {
    XmlJdbcConnection xmlJdbcConnection;

    RestTemplateImpl restTemplateImpl;

    public XmlJdbcConnection getXmlJdbcConnection() {
        return xmlJdbcConnection;
    }

    public void setXmlJdbcConnection(XmlJdbcConnection xmlJdbcConnection) {
        this.xmlJdbcConnection = xmlJdbcConnection;
    }

    public RestTemplateImpl getRestTemplateImpl() {
        return restTemplateImpl;
    }

    public void setRestTemplateImpl(RestTemplateImpl restTemplateImpl) {
        this.restTemplateImpl = restTemplateImpl;
    }
}
