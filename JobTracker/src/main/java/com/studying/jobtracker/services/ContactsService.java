package com.studying.jobtracker.services;

import com.studying.jobtracker.entities.Contact;
import java.util.Optional;

public interface ContactsService {

  Optional<Contact> findById(int id);
  Optional<Contact> findByEmail(String email);
  Optional<Contact> findByName(String name);
  Contact save(Contact contact);
  void delete(int id);
  Optional<Contact> update(Contact contact);

}
