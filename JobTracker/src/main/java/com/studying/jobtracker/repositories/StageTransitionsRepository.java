package com.studying.jobtracker.repositories;

import com.studying.jobtracker.entities.StageTransition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StageTransitionsRepository extends JpaRepository<StageTransition, Integer> {

}
