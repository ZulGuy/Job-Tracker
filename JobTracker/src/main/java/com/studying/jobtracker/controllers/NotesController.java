package com.studying.jobtracker.controllers;

import com.studying.jobtracker.services.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotesController {

  private final NotesService notesService;

  @Autowired
  public NotesController(NotesService notesService) {
    this.notesService = notesService;
  }

}
