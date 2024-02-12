package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

import com.example.restservice.quoteRepo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Optional;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;
import com.example.restservice.quote; // Check if this is the correct import path for your Quote class
import com.example.restservice.quoteRepo; // Check if this is the correct import path for your QuoteRepo interface

@RestController
public class quoteController {

	private final quoteRepo quoteRepository;

	public quoteController(quoteRepo quoteRepository) {
		this.quoteRepository = quoteRepository;
	}

    @GetMapping("/quote")
    public ResponseEntity<Object> findQuote(@RequestParam(value = "Id", defaultValue = "1") Long id) {
        Optional<quote> quoteOptional = quoteRepository.findById(id);
        System.out.println(quoteOptional);
        if (quoteOptional.isPresent()) {
            return ResponseEntity.ok(quoteOptional.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
