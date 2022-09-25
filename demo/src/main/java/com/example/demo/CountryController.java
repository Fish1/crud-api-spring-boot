package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

  @Autowired
  CountryService countryService;

  /* Create country */
  @PostMapping("/country")
  private int saveCountry(@RequestBody Country country) {
    countryService.saveOrUpdate(country);
    return country.getId();
  }

  /* Get all countries */
  @GetMapping("/countries")
  private List<Country> getAllCountry() {
    return countryService.getAllCountry();
  }

  /* Get single country */
  @GetMapping("/countries/{id}")
  private Country getCountry(@PathVariable("id") int id) {
    return countryService.getCountryById(id);
  }

  /* Update country */
  @PutMapping("/countries/{id}")
  private Country update(@PathVariable("id") int id, @RequestBody Country country) {
    country.setId(id);
    countryService.saveOrUpdate(country);
    return country;
  }


  /* Delete country */
  @DeleteMapping("/countries/{id}")
  private void deleteCountry(@PathVariable("id") int id) {
    countryService.delete(id);
  }
}
