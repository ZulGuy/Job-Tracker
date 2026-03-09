package com.studying.jobtracker.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Positive;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "users")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  @Column(name = "name")
  private String name;
  @Column(name = "description")
  private String description;
  @Column(name = "experience")
  private String experience;
  @Column(name = "skills")
  private String skills;
  @Column(name = "number")
  @Positive
  private String number;
  @Column(name = "email")
  @Email
  private String email;
  @Column(name = "socials")
  private String socials;
  @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<Vacancy> vacancies = new ArrayList<>();
  @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<Note> notes = new ArrayList<>();

  public User(int id, String name, String description, String experience, String skills,
      String number, String email, String socials) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.experience = experience;
    this.skills = skills;
    this.number = number;
    this.email = email;
    this.socials = socials;
  }

  public User(int id, String name, String description, String experience, String skills,
      String number, String email, String socials, List<Vacancy> vacancies) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.experience = experience;
    this.skills = skills;
    this.number = number;
    this.email = email;
    this.socials = socials;
    this.vacancies = vacancies;
  }

  public User(List<Note> notes, List<Vacancy> vacancies, String socials, String email,
      String number,
      String skills, String experience, String description, String name, int id) {
    this.notes = notes;
    this.vacancies = vacancies;
    this.socials = socials;
    this.email = email;
    this.number = number;
    this.skills = skills;
    this.experience = experience;
    this.description = description;
    this.name = name;
    this.id = id;
  }

  public User() {
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

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getExperience() {
    return experience;
  }

  public void setExperience(String experience) {
    this.experience = experience;
  }

  public String getSkills() {
    return skills;
  }

  public void setSkills(String skills) {
    this.skills = skills;
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

  public List<Vacancy> getVacancies() {
    return vacancies;
  }

  public void setVacancies(List<Vacancy> vacancies) {
    this.vacancies = vacancies;
  }

  public List<Note> getNotes() {
    return notes;
  }

  public void setNotes(List<Note> notes) {
    this.notes = notes;
  }
}
