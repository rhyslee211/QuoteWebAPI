package com.example.restservice;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface quoteRepo extends CrudRepository<quote, Long> {
    
}
