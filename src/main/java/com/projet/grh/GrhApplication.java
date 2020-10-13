package com.projet.grh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.projet.grh.repository")
@SpringBootApplication
public class GrhApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrhApplication.class, args);
    }

}
