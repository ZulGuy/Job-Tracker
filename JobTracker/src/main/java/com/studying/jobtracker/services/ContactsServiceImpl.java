package com.studying.jobtracker.services;

import com.studying.jobtracker.dto.ContactDTO;
import com.studying.jobtracker.entities.Contact;
import com.studying.jobtracker.repositories.ContactsRepository;
import jakarta.persistence.EntityNotFoundException;
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
  public Contact findById(int id) {
    return contactsRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Contact not found"));
  }

  @Override
  public Contact findByEmail(String email) {
    return contactsRepository.findByEmail(email).orElseThrow(() -> new EntityNotFoundException("Contact not found"));
  }

  @Override
  public Contact findByName(String name) {
    return contactsRepository.findByName(name).orElseThrow(() -> new EntityNotFoundException("Contact not found"));
  }

  @Override
  public Contact save(ContactDTO dto) {
    Contact contact = toEntity(dto);
    contactsRepository.save(contact);
    if(contactsRepository.findByEmail(dto.email()).isPresent())
      return contactsRepository.findByEmail(dto.email()).get();
    throw new EntityNotFoundException("Contact is not saved");
  }

  @Override
  public void delete(int id) {
    contactsRepository.deleteById(id);
  }

  @Override
  public Contact update(ContactDTO dto) {
    Contact contact = toEntity(dto);
    contactsRepository.save(contact);
    if(contactsRepository.findByEmail(dto.email()).isPresent())
      return contactsRepository.findByEmail(dto.email()).get();
    throw new EntityNotFoundException("Contact is not updated");
  }

  private Contact toEntity(ContactDTO dto) {
    Contact contact = new Contact();
    contact.setEmail(dto.email());
    contact.setName(dto.name());
    contact.setNumber(dto.number());
    contact.setSocials(dto.socials());
    return contact;
  }
}
