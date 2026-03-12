package com.studying.jobtracker.services;

import com.studying.jobtracker.dto.NoteDTO;
import com.studying.jobtracker.entities.Note;
import com.studying.jobtracker.repositories.NotesRepository;
import jakarta.persistence.EntityNotFoundException;
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
  public Note findById(int id) {
    return notesRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Note not found"));
  }

  @Override
  public Note save(NoteDTO dto) {
    Note note = toEntity(dto);
    notesRepository.save(note);
    if (notesRepository.findById(note.getId()).isPresent())
      return notesRepository.findById(note.getId()).get();
    throw new EntityNotFoundException("Note is not saved");
  }

  @Override
  public void delete(int id) {
    notesRepository.deleteById(id);
  }

  @Override
  public Note update(NoteDTO dto) {
    Note note = toEntity(dto);
    notesRepository.save(note);
    if (notesRepository.findById(note.getId()).isPresent())
      return notesRepository.findById(note.getId()).get();
    throw new EntityNotFoundException("Note is not updated");
  }

  private Note toEntity(NoteDTO dto) {
    Note note = new Note();
    note.setContent(dto.content());
    return note;
  }
}
