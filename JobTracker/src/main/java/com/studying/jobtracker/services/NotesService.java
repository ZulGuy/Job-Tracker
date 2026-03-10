package com.studying.jobtracker.services;

import com.studying.jobtracker.dto.NoteDTO;
import com.studying.jobtracker.entities.Note;
import java.util.Optional;

public interface NotesService {

  Optional<Note> findById(int id);
  Note save(NoteDTO dto);
  void delete(int id);
  Optional<Note> update(NoteDTO dto);

}
