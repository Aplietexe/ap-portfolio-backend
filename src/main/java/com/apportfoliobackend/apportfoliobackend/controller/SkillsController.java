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

import com.apportfoliobackend.apportfoliobackend.model.Skill;
import com.apportfoliobackend.apportfoliobackend.service.ISkillService;

@RestController
@RequestMapping("/skills")
public class SkillsController {
    @Autowired
    private ISkillService skillService;

    @GetMapping("/")
    public List<Skill> getSkills() {
        return skillService.getSkills();
    }

    @PostMapping("/")
    public void createSkill(@RequestBody Skill skill) {
        skillService.createSkill(skill);
    }

    @PutMapping("/")
    public void updateSkill(@RequestBody Skill skill) {
        skillService.updateSkill(skill);
    }

    @DeleteMapping("/{id}")
    public void deleteSkill(@PathVariable Long id) {
        skillService.deleteSkill(id);
    }
}
