package com.apportfoliobackend.apportfoliobackend.service;

import java.util.List;

import com.apportfoliobackend.apportfoliobackend.model.Education;

public interface IEducationService {
    void createEducation(Education education);

    void updateEducation(Education education);

    void deleteEducation(Long id);

    List<Education> getEducations();
}
