package com.studying.jobtracker.services;

import com.studying.jobtracker.entities.Contact;
import com.studying.jobtracker.repositories.ContactsRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactsServiceImpl implements ContactsService{

  private final ContactsRepository contactsRepository;

  @Autowired
  public ContactsServiceImpl(ContactsRepository contactsRepository) {
    this.contactsRepository = contactsRepository;
  }

  @Override
  public Optional<Contact> findById(int id) {
    return Optional.empty();
  }

  @Override
  public Optional<Contact> findByEmail(String email) {
    return Optional.empty();
  }

  @Override
  public Optional<Contact> findByName(String name) {
    return Optional.empty();
  }

  @Override
  public Contact save(Contact contact) {
    return null;
  }

  @Override
  public void delete(int id) {

  }

  @Override
  public Optional<Contact> update(Contact contact) {
    return Optional.empty();
  }
}
