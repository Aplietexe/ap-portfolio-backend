package com.apportfoliobackend.apportfoliobackend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.apportfoliobackend.apportfoliobackend.model.Language;
import com.apportfoliobackend.apportfoliobackend.repository.LanguageRepository;

@Service
public class LanguageService implements ILanguageService {
    public final LanguageRepository languageRepository;

    LanguageService(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public void createLanguage(Language language) {
        languageRepository.save(language);
    }

    @Override
    public void updateLanguage(Language language) {
        languageRepository.save(language);
    }

    @Override
    public void deleteLanguage(Long id) {
        languageRepository.deleteById(id);
    }

    @Override
    public List<Language> getLanguages() {
        return languageRepository.findAll();
    }

}
