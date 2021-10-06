package com.kryhowsky.springguru1.repository;

import com.kryhowsky.springguru1.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
