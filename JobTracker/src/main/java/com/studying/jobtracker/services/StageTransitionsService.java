package com.studying.jobtracker.services;

import com.studying.jobtracker.entities.StageTransition;
import java.util.Optional;

public interface StageTransitionsService {

  Optional<StageTransition> findById(int id);
  Optional<StageTransition> findByFromAndTo(String from, String to);
  StageTransition save(StageTransition stageTransition);
  void delete(int id);
  Optional<StageTransition> update(StageTransition stageTransition);

}
