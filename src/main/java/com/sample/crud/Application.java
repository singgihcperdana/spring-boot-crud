package com.sample.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication 
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.sample.crud"})
@EnableJpaRepositories(basePackages="com.sample.crud.repositories")
@EnableTransactionManagement
@EntityScan(basePackages="com.sample.crud.entities")
public class Application {

    public static void main(String[] args) {
		//skdfjh
        SpringApplication.run(Application.class, args);
    }
    
}
