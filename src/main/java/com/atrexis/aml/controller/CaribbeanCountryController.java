package com.atrexis.aml.controller;

import com.atrexis.aml.model.CaribbeanCountryDto;
import com.atrexis.aml.service.CaribbeanCountryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/caribbean-countries")
public class CaribbeanCountryController {

    @Autowired
    private CaribbeanCountryServiceImpl caribbeanCountryService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<CaribbeanCountryDto>> get() {

        return ResponseEntity.ok(this.caribbeanCountryService.findAll());
    }

    @RequestMapping(path = "ex", method = RequestMethod.GET)
    public ResponseEntity<Iterable<CaribbeanCountryDto>> ex() throws Exception {

        throw new Exception("Exception Occurred");
    }
}
