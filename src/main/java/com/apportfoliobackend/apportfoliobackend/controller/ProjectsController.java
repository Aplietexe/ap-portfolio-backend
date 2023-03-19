package com.apportfoliobackend.apportfoliobackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apportfoliobackend.apportfoliobackend.model.Project;
import com.apportfoliobackend.apportfoliobackend.service.IProjectService;

@RestController
@RequestMapping("/projects")
public class ProjectsController {
    @Autowired
    private IProjectService projectService;

    @GetMapping("/")
    public List<Project> getProjects() {
        return projectService.getProjects();
    }

    @PostMapping("/")
    public void createProject(@RequestBody Project project) {
        projectService.createProject(project);
    }

    @PutMapping("/")
    public void updateProject(@RequestBody Project project) {
        projectService.updateProject(project);
    }

    @DeleteMapping("/{id}")
    public void deleteProject(@PathVariable Long id) {
        projectService.deleteProject(id);
    }
}
