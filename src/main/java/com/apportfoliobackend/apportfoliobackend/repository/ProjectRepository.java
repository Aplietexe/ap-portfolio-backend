package com.apportfoliobackend.apportfoliobackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apportfoliobackend.apportfoliobackend.model.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {

}
