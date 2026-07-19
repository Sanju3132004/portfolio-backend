package com.portfolio.backend.service;

import com.portfolio.backend.model.Project;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectService {

    private final List<Project> projects = new ArrayList<>();

    public ProjectService() {
        // sample data - later idha DB (MySQL/PostgreSQL) la irundhu edukalam
        projects.add(new Project(1L, "Portfolio Website", "Personal portfolio site", "React, Java, Spring Boot"));
        projects.add(new Project(2L, "E-Commerce App", "Simple online store", "React, Spring Boot, MySQL"));
        projects.add(new Project(3L, "Task Manager", "To-do list application", "React, Spring Boot"));
    }

    public List<Project> getAllProjects() {
        return projects;
    }

    public Project addProject(Project project) {
        project.setId((long) (projects.size() + 1));
        projects.add(project);
        return project;
    }
}
