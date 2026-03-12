package com.studying.jobtracker.services;

import com.studying.jobtracker.dto.StageTransitionDTO;
import com.studying.jobtracker.entities.StageTransition;
import java.util.Optional;

public interface StageTransitionsService {

  StageTransition findById(int id);
  StageTransition findByFromAndTo(String from, String to);
  StageTransition save(StageTransitionDTO dto);
  void delete(int id);
  StageTransition update(StageTransitionDTO dto);

}
