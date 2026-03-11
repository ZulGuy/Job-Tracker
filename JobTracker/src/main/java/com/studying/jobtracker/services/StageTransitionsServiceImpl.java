package com.studying.jobtracker.services;

import com.studying.jobtracker.entities.StageTransition;
import com.studying.jobtracker.repositories.StageTransitionsRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StageTransitionsServiceImpl implements StageTransitionsService{

  private final StageTransitionsRepository stageTransitionsRepository;

  @Autowired
  public StageTransitionsServiceImpl(StageTransitionsRepository stageTransitionsRepository) {
    this.stageTransitionsRepository = stageTransitionsRepository;
  }

  @Override
  public Optional<StageTransition> findById(int id) {
    return Optional.empty();
  }

  @Override
  public Optional<StageTransition> findByFromAndTo(String from, String to) {
    return Optional.empty();
  }

  @Override
  public StageTransition save(StageTransition stageTransition) {
    return null;
  }

  @Override
  public void delete(int id) {

  }

  @Override
  public Optional<StageTransition> update(StageTransition stageTransition) {
    return Optional.empty();
  }
}
