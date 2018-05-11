package com.esppablo.languages.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.esppablo.languages.models.Language;


@Service
public class LanguageService {
	// initialize the languages variable with values
	private List<Language> languages = new ArrayList<Language>(Arrays.asList(
			new Language("Java", "James Gosling", "1.8"),
			new Language("Python", "Guido van Rossun", "3.6"),
			new Language("Java Script", "Brendan Eich", "1.9.5")
	));
	
    // returns all the languages
    public List<Language> allLanguages() {
        return languages;
    }
    
    // return language
    public Language findLanguageByIndex(int index) {
        if (index < languages.size()){
            return languages.get(index);
        }else{
            return null;
        }
    }
    
    // add new language
    public void addLanguage(Language language) {
    	languages.add(language);
    }
    
    // edit language
    public void updateLanguage(int id, Language language) {
    	if (id < languages.size()) {
    		languages.set(id, language);
    	}
    }
    
    // delete language
    public void destroyLanguage(int id) {
    	if (id < languages.size()) {
    		languages.remove(id);
    	}
    }
}
