package com.jorgehernandezramirez.spring.springboot.property.controller;

import com.jorgehernandezramirez.spring.springboot.property.configuration.SpringDataConfiguration;
import com.jorgehernandezramirez.spring.springboot.property.configuration.SpringDatasConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(value = "/property")
public class PropertyController {

    @Value("${spring.springdata.mongodb.name}")
    private String mongoDBName;

    @Autowired
    private Environment environment;

    @Autowired
    private SpringDataConfiguration mongoDBConfiguration;

    @Autowired
    private SpringDatasConfiguration springDatasConfiguration;

    public PropertyController(){
        //For Spring
    }

    @RequestMapping("/mongodb/name/value")
    public String getMongoDbNameUsingValue(){
        return mongoDBName;
    }

    @RequestMapping("/mongodb/name/enviroment")
    public String getMongoDbNameUsingEnviroment(){
        return environment.getProperty("spring.springdata.mongodb.name");
    }

    @RequestMapping("/mongodb/name/configurationproperties")
    public String getMongoDbNameUsingConfigurationProperties(){
        return mongoDBConfiguration.getName();
    }

    @RequestMapping("/")
    public Map<String, SpringDataConfiguration> getAllConfigurationUsingConfigurationProperties(){
        return springDatasConfiguration.getSpringdata();
    }
}
