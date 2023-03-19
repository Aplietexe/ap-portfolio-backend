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

import com.apportfoliobackend.apportfoliobackend.model.Education;
import com.apportfoliobackend.apportfoliobackend.service.IEducationService;

@RestController
@RequestMapping("/education")
public class EducationController {
    @Autowired
    private IEducationService educationService;

    @GetMapping("/")
    public List<Education> getEducations() {
        return educationService.getEducations();
    }

    @PostMapping("/")
    public void createEducation(@RequestBody Education education) {
        educationService.createEducation(education);
    }

    @PutMapping("/")
    public void updateEducation(@RequestBody Education education) {
        educationService.updateEducation(education);
    }

    @DeleteMapping("/{id}")
    public void deleteEducation(@PathVariable Long id) {
        educationService.deleteEducation(id);
    }
}
