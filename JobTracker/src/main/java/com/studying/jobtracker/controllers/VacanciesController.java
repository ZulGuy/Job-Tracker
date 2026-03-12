package com.studying.jobtracker.controllers;

import com.studying.jobtracker.services.VacanciesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VacanciesController {

  private final VacanciesService vacanciesService;

  @Autowired
  public VacanciesController(VacanciesService vacanciesService) {
    this.vacanciesService = vacanciesService;
  }

}
