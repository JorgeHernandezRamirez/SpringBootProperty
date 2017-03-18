package com.jorgehernandezramirez.spring.springboot.property.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.io.Serializable;
import java.util.List;

@Configuration
@ConfigurationProperties("spring.springdata.mongodb")
public class SpringDataConfiguration implements Serializable {

    private Boolean relational;

    private String name;

    private List<String> founders;

    public SpringDataConfiguration(){
        //For Spring
    }

    public SpringDataConfiguration(Boolean relational, String name, List<String> founders) {
        this.relational = relational;
        this.name = name;
        this.founders = founders;
    }

    public Boolean getRelational() {
        return relational;
    }

    public void setRelational(Boolean relational) {
        this.relational = relational;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getFounders() {
        return founders;
    }

    public void setFounders(List<String> founders) {
        this.founders = founders;
    }

    @Override
    public String toString() {
        return "MongoDBConfiguration{" +
                "relational=" + relational +
                ", name='" + name + '\'' +
                ", founders='" + founders + '\'' +
                '}';
    }
}
