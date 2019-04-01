package com.example.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.models.Book;

//@RepositoryRestResource(path="entity")
public interface BookRepository extends JpaRepository<Book,Integer> {	
	
	

}
