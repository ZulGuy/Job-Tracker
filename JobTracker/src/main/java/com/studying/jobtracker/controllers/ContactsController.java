package com.studying.jobtracker.controllers;

import com.studying.jobtracker.services.ContactsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactsController {

  private final ContactsService contactsService;

  @Autowired
  public ContactsController(ContactsService contactsService) {
    this.contactsService = contactsService;
  }

}
