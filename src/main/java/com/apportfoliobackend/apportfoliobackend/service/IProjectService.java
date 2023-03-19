package com.apportfoliobackend.apportfoliobackend.service;

import java.util.List;

import com.apportfoliobackend.apportfoliobackend.model.Project;

public interface IProjectService {
    void createProject(Project project);

    void updateProject(Project project);

    void deleteProject(Long id);

    List<Project> getProjects();
}
