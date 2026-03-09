package com.studying.jobtracker.entities;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Positive;

public class Contact {

  private int id;
  private String name;
  @Positive
  private String number;
  @Email
  private String email;
  private String socials;

  public Contact(int id, String name, String number, String email, String socials) {
    this.id = id;
    this.name = name;
    this.number = number;
    this.email = email;
    this.socials = socials;
  }

  public Contact() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getSocials() {
    return socials;
  }

  public void setSocials(String socials) {
    this.socials = socials;
  }
}
