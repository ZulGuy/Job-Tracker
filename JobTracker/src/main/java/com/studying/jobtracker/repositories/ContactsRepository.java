package com.studying.jobtracker.repositories;

import com.studying.jobtracker.entities.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactsRepository extends JpaRepository<Contact, Integer> {

}
