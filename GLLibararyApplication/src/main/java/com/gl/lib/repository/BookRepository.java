package com.gl.lib.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.lib.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
