package com.studying.jobtracker.services;

import com.studying.jobtracker.dto.StageTransitionDTO;
import com.studying.jobtracker.entities.StageTransition;
import com.studying.jobtracker.repositories.StageTransitionsRepository;
import com.studying.jobtracker.utils.Stage;
import jakarta.persistence.EntityNotFoundException;
import java.time.Instant;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StageTransitionsServiceImpl implements StageTransitionsService {

  private final StageTransitionsRepository stageTransitionsRepository;

  @Autowired
  public StageTransitionsServiceImpl(StageTransitionsRepository stageTransitionsRepository) {
    this.stageTransitionsRepository = stageTransitionsRepository;
  }

  @Override
  public StageTransition findById(int id) {
    return stageTransitionsRepository.findById(id)
        .orElseThrow(() -> new EntityNotFoundException("StageTransition not found"));
  }

  @Override
  public StageTransition findByFromAndTo(String from, String to) {
    return stageTransitionsRepository.findByFromAndTo(from, to)
        .orElseThrow(() -> new EntityNotFoundException("StageTransition not found"));
  }

  @Override
  public StageTransition save(StageTransitionDTO dto) {
    StageTransition stageTransition = toEntity(dto);
    stageTransitionsRepository.save(stageTransition);
    if (stageTransitionsRepository.findById(stageTransition.getId()).isPresent())
      return stageTransitionsRepository.findById(stageTransition.getId()).get();
    throw new EntityNotFoundException("StageTransition is not saved");
  }

  @Override
  public void delete(int id) {

  }

  @Override
  public StageTransition update(StageTransitionDTO dto) {
    StageTransition stageTransition = toEntity(dto);
    stageTransitionsRepository.save(stageTransition);
    if (stageTransitionsRepository.findById(stageTransition.getId()).isPresent())
      return stageTransitionsRepository.findById(stageTransition.getId()).get();
    throw new EntityNotFoundException("StageTransition is not updated");
  }

  private StageTransition toEntity(StageTransitionDTO dto) {
    StageTransition stageTransition = new StageTransition();
    stageTransition.setChangedAt(Instant.now());
    stageTransition.setFrom(Stage.valueOf(dto.from()));
    stageTransition.setTo(Stage.valueOf(dto.to()));
    return stageTransition;
  }
}
