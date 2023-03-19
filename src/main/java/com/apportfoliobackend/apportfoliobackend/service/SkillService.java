package com.apportfoliobackend.apportfoliobackend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.apportfoliobackend.apportfoliobackend.model.Skill;
import com.apportfoliobackend.apportfoliobackend.repository.SkillRepository;

@Service
public class SkillService implements ISkillService {
    public final SkillRepository skillRepository;

    SkillService(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }

    @Override
    public void createSkill(Skill skill) {
        skillRepository.save(skill);
    }

    @Override
    public void updateSkill(Skill skill) {
        skillRepository.save(skill);
    }

    @Override
    public void deleteSkill(Long id) {
        skillRepository.deleteById(id);
    }

    @Override
    public List<Skill> getSkills() {
        return skillRepository.findAll();
    }

}
