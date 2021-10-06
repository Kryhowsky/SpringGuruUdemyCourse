package com.kryhowsky.springguru1.repository;

import com.kryhowsky.springguru1.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
