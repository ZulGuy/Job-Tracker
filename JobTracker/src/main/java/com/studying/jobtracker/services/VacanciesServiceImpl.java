package com.studying.jobtracker.services;

import com.studying.jobtracker.dto.VacancyDTO;
import com.studying.jobtracker.entities.Vacancy;
import com.studying.jobtracker.repositories.VacanciesRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VacanciesServiceImpl implements VacanciesService{

  private final VacanciesRepository vacanciesRepository;

  @Autowired
  public VacanciesServiceImpl(VacanciesRepository vacanciesRepository) {
    this.vacanciesRepository = vacanciesRepository;
  }

  @Override
  public Optional<Vacancy> findById(int id) {
    return Optional.empty();
  }

  @Override
  public Optional<Vacancy> findByName(String name) {
    return Optional.empty();
  }

  @Override
  public Vacancy save(VacancyDTO dto) {
    return null;
  }

  @Override
  public void delete(int id) {

  }

  @Override
  public Optional<Vacancy> update(VacancyDTO dto) {
    return Optional.empty();
  }
}
