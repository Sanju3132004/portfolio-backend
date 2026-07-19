package com.gojosoftwaretech.portfolio.repository;

import com.gojosoftwaretech.portfolio.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
