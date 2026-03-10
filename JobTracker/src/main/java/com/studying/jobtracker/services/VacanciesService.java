package com.studying.jobtracker.services;

import com.studying.jobtracker.dto.VacancyDTO;
import com.studying.jobtracker.entities.Vacancy;
import java.util.Optional;

public interface VacanciesService {

  Optional<Vacancy> findById(int id);
  Optional<Vacancy> findByName(String name);
  Vacancy save(VacancyDTO dto);
  void delete(int id);
  Optional<Vacancy> update(VacancyDTO dto);

}
