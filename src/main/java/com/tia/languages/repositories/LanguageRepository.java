package com.tia.languages.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tia.languages.models.Language;

@Repository
public interface LanguageRepository extends CrudRepository<Language, Long>{
    
    List<Language> findAll();
    
    List<Language> findByDescriptionContaining(String search);
    
    Long countByTitleContaining(String search);
    
    Long deleteByTitleStartingWith(String search);
}