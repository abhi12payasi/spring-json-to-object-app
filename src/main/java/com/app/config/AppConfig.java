package com.app.config;

import com.app.bean.Employee;
import com.app.util.FileReader;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import java.io.IOException;

@PropertySource("application.properties")
@Configuration
public class AppConfig {

    @Autowired
    private Environment environment;
    @Bean
    public Employee employee(){
        Employee employee = new Employee();
        String path = environment.getProperty("jsonPath");

        FileReader fileReader = new FileReader();
        String json = fileReader.read(path);

        ObjectMapper mapper = new ObjectMapper();

        try {
            employee = mapper.readValue(json, Employee.class); //readValue(new File(path),Employee.class)
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employee;
    }
}
