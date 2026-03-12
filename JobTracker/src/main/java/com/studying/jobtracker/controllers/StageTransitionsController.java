package com.studying.jobtracker.controllers;

import com.studying.jobtracker.services.StageTransitionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StageTransitionsController {

  private final StageTransitionsService stageTransitionsService;

  @Autowired
  public StageTransitionsController(StageTransitionsService stageTransitionsService) {
    this.stageTransitionsService = stageTransitionsService;
  }

}
