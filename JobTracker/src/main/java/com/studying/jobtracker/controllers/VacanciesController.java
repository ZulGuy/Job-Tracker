package com.studying.jobtracker.controllers;

import com.studying.jobtracker.entities.Vacancy;
import com.studying.jobtracker.services.VacanciesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vacancies")
public class VacanciesController {

  private final VacanciesService vacanciesService;

  @Autowired
  public VacanciesController(VacanciesService vacanciesService) {
    this.vacanciesService = vacanciesService;
  }

  @GetMapping
  public ResponseEntity<List<Vacancy>> getAllVacancies() {
    return new ResponseEntity<>(vacanciesService.getAllVacancies(), HttpStatus.OK);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Vacancy> getVacancyById(
      @PathVariable int id) {
    return new ResponseEntity<>(vacanciesService.findById(id), HttpStatus.OK);
  }

  @GetMapping("/{name}")
  public ResponseEntity<Vacancy> getVacancyByName(
      @PathVariable String name) {
    return new ResponseEntity<>(vacanciesService.findByName(name), HttpStatus.OK);
  }

}
