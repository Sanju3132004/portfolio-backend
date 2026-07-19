package com.gojosoftwaretech.portfolio.config;

import com.gojosoftwaretech.portfolio.model.Project;
import com.gojosoftwaretech.portfolio.repository.ProjectRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataSeeder implements CommandLineRunner {

    private final ProjectRepository projectRepository;

    public DataSeeder(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public void run(String... args) {
        if (projectRepository.count() == 0) {

            Project p1 = new Project();
            p1.setTitle("Portfolio Website");
            p1.setDescription("Personal portfolio site built with React and Spring Boot");
            p1.setTechStack("React, Java, Spring Boot");
            p1.setGithubLink("https://github.com/Sanju3132004");
            p1.setLiveDemoLink("https://portfolio-frontend-psi-coral.vercel.app");
            projectRepository.save(p1);

            Project p2 = new Project();
            p2.setTitle("E-Commerce App");
            p2.setDescription("Simple online store with product listing and cart");
            p2.setTechStack("React, Spring Boot, MySQL");
            p2.setGithubLink("https://github.com/Sanju3132004");
            p2.setLiveDemoLink("");
            projectRepository.save(p2);

            Project p3 = new Project();
            p3.setTitle("Task Manager");
            p3.setDescription("To-do list application with add, edit, delete tasks");
            p3.setTechStack("React, Spring Boot");
            p3.setGithubLink("https://github.com/Sanju3132004");
            p3.setLiveDemoLink("");
            projectRepository.save(p3);
        }
    }
}