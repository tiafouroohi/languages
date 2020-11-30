package com.tia.languages.services;

import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
@Service
public class LanguageService {
    // adding the book repository as a dependency
    private final LanguageService languageService;
    
    public LanguageService(LanguageService languageService) {
        this.languageRepository = languageRepository;
    }
    // returns all the books
    public List<Book> allBooks() {
        return languageRepository.findAll();
    }
    // creates a book
    public Language createBook(Book b) {
        return langaugeRepository.save(b);
    }
    // retrieves a book
    public Language findBook(Long id) {
        Optional<Book> optionalBook = languageRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
}