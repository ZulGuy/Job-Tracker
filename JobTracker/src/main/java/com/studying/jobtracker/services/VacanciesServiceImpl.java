package com.studying.jobtracker.services;

import com.studying.jobtracker.dto.VacancyDTO;
import com.studying.jobtracker.entities.Vacancy;
import com.studying.jobtracker.repositories.VacanciesRepository;
import com.studying.jobtracker.utils.Stage;
import jakarta.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VacanciesServiceImpl implements VacanciesService {

  private final VacanciesRepository vacanciesRepository;

  @Autowired
  public VacanciesServiceImpl(VacanciesRepository vacanciesRepository) {
    this.vacanciesRepository = vacanciesRepository;
  }

  public List<Vacancy> getAllVacancies() {
    return vacanciesRepository.findAll();
  }

  @Override
  public Vacancy findById(int id) {
    return vacanciesRepository.findById(id)
        .orElseThrow(() -> new IllegalArgumentException("Vacancy not found"));
  }

  @Override
  public Vacancy findByName(String name) {
    return vacanciesRepository.findByName(name)
        .orElseThrow(() -> new EntityNotFoundException("Vacancy not found"));
  }

  @Override
  public Vacancy save(VacancyDTO dto) {
    Vacancy vacancy = toEntity(dto);
    vacanciesRepository.save(vacancy);
    if (vacanciesRepository.findById(vacancy.getId()).isPresent())
      return vacanciesRepository.findById(vacancy.getId()).get();
    throw new EntityNotFoundException("Vacancy is not saved");
  }

  @Override
  public void delete(int id) {
    vacanciesRepository.deleteById(id);
  }

  @Override
  public Vacancy update(VacancyDTO dto) {
    Vacancy vacancy = toEntity(dto);
    vacanciesRepository.save(vacancy);
    if (vacanciesRepository.findById(vacancy.getId()).isPresent())
      return vacanciesRepository.findById(vacancy.getId()).get();
    throw new EntityNotFoundException("Vacancy is not updated");
  }

  private Vacancy toEntity(VacancyDTO dto) {
    Vacancy vacancy = new Vacancy();
    vacancy.setName(dto.name());
    vacancy.setSalary(dto.salary());
    vacancy.setCompany(dto.company());
    vacancy.setDescription(dto.description());
    vacancy.setRequirements(dto.requirements());
    vacancy.setCurrentStage(Stage.valueOf(dto.currentStage()));
    return vacancy;
  }

}
