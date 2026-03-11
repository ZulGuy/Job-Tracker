package com.studying.jobtracker.services;

import com.studying.jobtracker.dto.NoteDTO;
import com.studying.jobtracker.entities.Note;
import com.studying.jobtracker.repositories.NotesRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotesServiceImpl implements NotesService{

  private final NotesRepository notesRepository;

  @Autowired
  public NotesServiceImpl(NotesRepository notesRepository) {
    this.notesRepository = notesRepository;
  }

  @Override
  public Optional<Note> findById(int id) {
    return Optional.empty();
  }

  @Override
  public Note save(NoteDTO dto) {
    return null;
  }

  @Override
  public void delete(int id) {

  }

  @Override
  public Optional<Note> update(NoteDTO dto) {
    return Optional.empty();
  }
}
