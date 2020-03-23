package com.app.filter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@PropertySource("application.properties")
public class PropertyFilter {

    @Autowired
    private Environment environment;

    public void filter(String pattern){
        System.out.println("");
    }
}
