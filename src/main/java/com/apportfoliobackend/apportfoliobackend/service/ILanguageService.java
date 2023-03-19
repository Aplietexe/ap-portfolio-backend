package com.apportfoliobackend.apportfoliobackend.service;

import java.util.List;

import com.apportfoliobackend.apportfoliobackend.model.Language;

public interface ILanguageService {
    void createLanguage(Language language);

    void updateLanguage(Language language);

    void deleteLanguage(Long id);

    List<Language> getLanguages();
}
