package io.dinosauruncle.tacademy.springbooot.service;

import java.util.Optional;

import io.dinosauruncle.tacademy.springbooot.domain.Book;

public interface BookService {
	
	Optional<Book> findById(Long id);	
}
