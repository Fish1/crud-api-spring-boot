package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

  @Autowired
  CountryRepository repository;

  public List<Country> getAllCountry() {
    List<Country> countries = new ArrayList<Country>();
    repository.findAll().forEach(country -> {
      
      countries.add(country);
    });
    return countries;
  }

  public Country getCountryById(int id) {
    return repository.findById(id).get();
  }

  public void saveOrUpdate(Country country) {
    repository.save(country);
  }

  public void delete(int id) {
    repository.deleteById(id);
  }
}
