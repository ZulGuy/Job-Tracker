package com.studying.jobtracker.repositories;

import com.studying.jobtracker.entities.Contact;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactsRepository extends JpaRepository<Contact, Integer> {

  Optional<Contact> findByEmail(String email);
  Optional<Contact> findByName(String name);

}
