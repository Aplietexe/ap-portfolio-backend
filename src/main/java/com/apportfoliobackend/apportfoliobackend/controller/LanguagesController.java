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

import com.apportfoliobackend.apportfoliobackend.model.Language;
import com.apportfoliobackend.apportfoliobackend.service.ILanguageService;

@RestController
@RequestMapping("/languages")
public class LanguagesController {
    @Autowired
    private ILanguageService languageService;

    @GetMapping("/")
    public List<Language> getLanguages() {
        return languageService.getLanguages();
    }

    @PostMapping("/")
    public void createLanguage(@RequestBody Language language) {
        languageService.createLanguage(language);
    }

    @PutMapping("/")
    public void updateLanguage(@RequestBody Language language) {
        languageService.updateLanguage(language);
    }

    @DeleteMapping("/{id}")
    public void deleteLanguage(@PathVariable Long id) {
        languageService.deleteLanguage(id);
    }
}
