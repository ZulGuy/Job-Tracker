package com.studying.jobtracker.repositories;

import com.studying.jobtracker.entities.Vacancy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VacanciesRepository extends JpaRepository<Vacancy, Integer> {

}
