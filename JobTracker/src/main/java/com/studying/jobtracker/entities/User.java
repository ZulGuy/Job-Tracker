package com.studying.jobtracker.entities;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Positive;
import java.util.List;

public class User {

  private int id;
  private String name;
  private String description;
  private String experience;
  private String skills;
  @Positive
  private String number;
  @Email
  private String email;
  private String socials;
  private List<Vacancy> vacancies;

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
}
