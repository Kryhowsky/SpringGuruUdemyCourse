package com.kryhowsky.springguru1.repository;

import com.kryhowsky.springguru1.domain.Publisher;
import org.springframework.data.repository.CrudRepository;


public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
