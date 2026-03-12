package com.studying.jobtracker.services;

import com.studying.jobtracker.dto.NoteDTO;
import com.studying.jobtracker.entities.Note;
import java.util.Optional;

public interface NotesService {

  Note findById(int id);
  Note save(NoteDTO dto);
  void delete(int id);
  Note update(NoteDTO dto);

}
