package com.apportfoliobackend.apportfoliobackend.service;

import java.util.List;

import com.apportfoliobackend.apportfoliobackend.model.Experience;

public interface IExperienceService {
    void createExperience(Experience experience);

    void updateExperience(Experience experience);

    void deleteExperience(Long id);

    List<Experience> getExperiences();
}
