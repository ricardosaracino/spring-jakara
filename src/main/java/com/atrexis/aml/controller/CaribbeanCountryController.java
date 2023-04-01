package com.atrexis.aml.controller;

import com.atrexis.aml.entity.CaribbeanCountryEntity;
import com.atrexis.aml.repository.CaribbeanCountryRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/caribbean-countries")
public class CaribbeanCountryController {

    private final CaribbeanCountryRepository repository;

    public CaribbeanCountryController(CaribbeanCountryRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Iterable<CaribbeanCountryEntity>> get() {

        this.repository.findAll();

        return ResponseEntity.ok(this.repository.findAll());
    }
}
