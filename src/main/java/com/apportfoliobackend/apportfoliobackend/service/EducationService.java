package com.apportfoliobackend.apportfoliobackend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.apportfoliobackend.apportfoliobackend.model.Education;
import com.apportfoliobackend.apportfoliobackend.repository.EducationRepository;

@Service
public class EducationService implements IEducationService {
    public final EducationRepository educationRepository;

    EducationService(EducationRepository educationRepository) {
        this.educationRepository = educationRepository;
    }

    @Override
    public void createEducation(Education education) {
        educationRepository.save(education);
    }

    @Override
    public void updateEducation(Education education) {
        educationRepository.save(education);
    }

    @Override
    public void deleteEducation(Long id) {
        educationRepository.deleteById(id);
    }

    @Override
    public List<Education> getEducations() {
        return educationRepository.findAll();
    }

}
