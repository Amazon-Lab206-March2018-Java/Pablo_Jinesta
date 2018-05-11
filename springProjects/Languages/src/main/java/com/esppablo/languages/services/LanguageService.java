package com.esppablo.languages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.esppablo.languages.models.Language;
import com.esppablo.languages.repositories.LanguageRepository;


@Service
public class LanguageService {
    private LanguageRepository languageRepository;
    
    public LanguageService(LanguageRepository languageRepository){
        this.languageRepository = languageRepository;
    }

	
    // returns all the languages
    public List<Language> allLanguages() {
    	// return languages;
        return languageRepository.findAll();
    }
    
    // return language
    public Language findLanguageById(Long id) {
        Optional<Language> optionalLanguage = languageRepository.findById(id);
        if(optionalLanguage.isPresent()) {
            return optionalLanguage.get();
        } else {
            return null;
        }
    }
    
    // add new language
    public void addLanguage(Language language) {
    	languageRepository.save(language);
    }
    
    // edit language
    public void updateLanguage(Language language) {
    	languageRepository.save(language);
    }
    
    // delete language
    public void destroyLanguage(Long id) {
		languageRepository.deleteById(id);
    }
}
