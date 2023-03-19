package com.apportfoliobackend.apportfoliobackend.service;

import java.util.List;

import com.apportfoliobackend.apportfoliobackend.model.Skill;

public interface ISkillService {
    void createSkill(Skill skill);

    void updateSkill(Skill skill);

    void deleteSkill(Long id);

    List<Skill> getSkills();
}
