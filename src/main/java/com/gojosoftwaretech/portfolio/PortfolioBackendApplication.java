package com.gojosoftwaretech.portfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Portfolio Backend Application
 * Company: Gojo Software Tech
 *
 * Entry point for the Spring Boot backend.
 * Run this class (Run As -> Java Application, or Run As -> Spring Boot App in Eclipse/STS)
 */
@SpringBootApplication
public class PortfolioBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(PortfolioBackendApplication.class, args);
        System.out.println("=========================================");
        System.out.println(" Gojo Software Tech - Portfolio Backend");
        System.out.println(" Server running at http://localhost:8080");
        System.out.println("=========================================");
    }

}
