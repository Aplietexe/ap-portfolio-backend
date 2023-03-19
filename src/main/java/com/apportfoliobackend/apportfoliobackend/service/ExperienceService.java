package com.apportfoliobackend.apportfoliobackend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.apportfoliobackend.apportfoliobackend.model.Experience;
import com.apportfoliobackend.apportfoliobackend.repository.ExperienceRepository;

@Service
public class ExperienceService implements IExperienceService {
    public final ExperienceRepository experienceRepository;

    ExperienceService(ExperienceRepository experienceRepository) {
        this.experienceRepository = experienceRepository;
    }

    @Override
    public void createExperience(Experience experience) {
        experienceRepository.save(experience);
    }

    @Override
    public void updateExperience(Experience experience) {
        experienceRepository.save(experience);
    }

    @Override
    public void deleteExperience(Long id) {
        experienceRepository.deleteById(id);
    }

    @Override
    public List<Experience> getExperiences() {
        return experienceRepository.findAll();
    }

}
