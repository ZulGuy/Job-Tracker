package com.studying.jobtracker.services;

import com.studying.jobtracker.dto.ContactDTO;
import com.studying.jobtracker.entities.Contact;
import java.util.Optional;

public interface ContactsService {

  Contact findById(int id);
  Contact findByEmail(String email);
  Contact findByName(String name);
  Contact save(ContactDTO dto);
  void delete(int id);
  Contact update(ContactDTO dto);

}
