package com.studying.jobtracker.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Positive;

@Entity(name = "contacts")
public class Contact {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  @Column(name = "name")
  private String name;
  @Column(name = "number")
  @Positive
  private String number;
  @Column(name = "email")
  @Email
  private String email;
  @Column(name = "socials")
  private String socials;
  @OneToOne
  @JoinColumn(name = "vacancy_id")
  private Vacancy vacancy;

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
