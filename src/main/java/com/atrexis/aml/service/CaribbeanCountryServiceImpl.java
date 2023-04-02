package com.atrexis.aml.service;

import com.atrexis.aml.model.CaribbeanCountryDto;
import com.atrexis.aml.repository.CaribbeanCountryRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CaribbeanCountryServiceImpl implements CaribbeanCountryService {

    @Autowired
    private CaribbeanCountryRepository caribbeanCountryRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<CaribbeanCountryDto> findAll() {

        return this.caribbeanCountryRepository
                .findAll()
                .stream()
                .map(user -> modelMapper.map(user, CaribbeanCountryDto.class))
                .collect(Collectors.toList());
    }
}
