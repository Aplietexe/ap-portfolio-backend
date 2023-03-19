package com.apportfoliobackend.apportfoliobackend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.apportfoliobackend.apportfoliobackend.model.Project;
import com.apportfoliobackend.apportfoliobackend.repository.ProjectRepository;

@Service
public class ProjectService implements IProjectService {
    public final ProjectRepository projectRepository;

    ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public void createProject(Project project) {
        projectRepository.save(project);
    }

    @Override
    public void updateProject(Project project) {
        projectRepository.save(project);
    }

    @Override
    public void deleteProject(Long id) {
        projectRepository.deleteById(id);
    }

    @Override
    public List<Project> getProjects() {
        return projectRepository.findAll();
    }

}
