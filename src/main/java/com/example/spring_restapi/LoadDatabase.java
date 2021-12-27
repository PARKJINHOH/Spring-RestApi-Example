package com.example.spring_restapi;

import com.example.spring_restapi.entity.Employee;
import com.example.spring_restapi.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new Employee("Jinho park", "burglar")));
            log.info("Preloading " + repository.save(new Employee("Gildong Hong", "thief")));
        };
    }
}
