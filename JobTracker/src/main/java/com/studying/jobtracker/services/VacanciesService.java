package com.studying.jobtracker.services;

import com.studying.jobtracker.dto.VacancyDTO;
import com.studying.jobtracker.entities.Vacancy;
import java.util.List;
import java.util.Optional;

public interface VacanciesService {

  List<Vacancy> getAllVacancies();
  Vacancy findById(int id);
  Vacancy findByName(String name);
  Vacancy save(VacancyDTO dto);
  void delete(int id);
  Vacancy update(VacancyDTO dto);

}
