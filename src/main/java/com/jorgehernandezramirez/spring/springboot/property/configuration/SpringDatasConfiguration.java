package com.jorgehernandezramirez.spring.springboot.property.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
@ConfigurationProperties("spring")
public class SpringDatasConfiguration {

    private Map<String, SpringDataConfiguration> springdata;

    public SpringDatasConfiguration(){
        //For Spring
    }

    public SpringDatasConfiguration(Map<String, SpringDataConfiguration> springdata) {
        this.springdata = springdata;
    }

    public Map<String, SpringDataConfiguration> getSpringdata() {
        return springdata;
    }

    public void setSpringdata(Map<String, SpringDataConfiguration> springdata) {
        this.springdata = springdata;
    }
}
