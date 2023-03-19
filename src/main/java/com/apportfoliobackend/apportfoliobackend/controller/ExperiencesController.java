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

import com.apportfoliobackend.apportfoliobackend.model.Experience;
import com.apportfoliobackend.apportfoliobackend.service.IExperienceService;

@RestController
@RequestMapping("/experiences")
public class ExperiencesController {
    @Autowired
    private IExperienceService experienceService;

    @GetMapping("/")
    public List<Experience> getExperiences() {
        return experienceService.getExperiences();
    }

    @PostMapping("/")
    public void createExperience(@RequestBody Experience experience) {
        experienceService.createExperience(experience);
    }

    @PutMapping("/")
    public void updateExperience(@RequestBody Experience experience) {
        experienceService.updateExperience(experience);
    }

    @DeleteMapping("/{id}")
    public void deleteExperience(@PathVariable Long id) {
        experienceService.deleteExperience(id);
    }
}
