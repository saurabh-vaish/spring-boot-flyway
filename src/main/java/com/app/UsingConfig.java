package com.app;

import jakarta.annotation.PostConstruct;
import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @Author saurabh vaish
 * @Date 21-12-2023
 */

@Configuration
public class UsingConfig {

    @Autowired
    private DataSource dataSource;

    // using java code , useful when we have to migration from two locations or in two diff data sources, so one can migrate from properties file config and another from here
//    @PostConstruct
    public void migrateQueries(){
        Flyway.configure().dataSource(dataSource).locations("classpath:db/migration").load().migrate();
    }
}
