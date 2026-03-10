package com.studying.jobtracker.entities;

import com.studying.jobtracker.utils.Stage;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.Valid;
import java.util.List;

@Entity(name = "vacancies")
public class Vacancy {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  @Column(name = "name")
  private String name;
  @Column(name = "company")
  private String company;
  @Column(name = "description")
  private String description;
  @Column(name = "requirements")
  private String requirements;
  @Column(name = "salary")
  private String salary;
  @Column(name = "current_stage")
  private Stage currentStage;
  @OneToOne(mappedBy = "vacancy", cascade = CascadeType.ALL, orphanRemoval = true)
  @Valid
  private Contact contact;
  @OneToOne(mappedBy = "vacancy", cascade = CascadeType.ALL, orphanRemoval = true)
  @Valid
  private Note note;
  @OneToMany(mappedBy = "vacancy", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<StageTransition> stageTransitions;

  public Vacancy(int id, String name, String company, String description, String requirements, String salary, Stage currentStage,
      Contact contact, Note note) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.requirements = requirements;
    this.salary = salary;
    this.currentStage = currentStage;
    this.contact = contact;
    this.note = note;
  }

  public Vacancy(int id, String name, String company, String description, String requirements, String salary,
      Stage currentStage, Contact contact, Note note, List<StageTransition> stageTransitions) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.requirements = requirements;
    this.salary = salary;
    this.currentStage = currentStage;
    this.contact = contact;
    this.note = note;
    this.stageTransitions = stageTransitions;
  }

  public Vacancy() {
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

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getRequirements() {
    return requirements;
  }

  public void setRequirements(String requirements) {
    this.requirements = requirements;
  }

  public String getSalary() {
    return salary;
  }

  public void setSalary(String salary) {
    this.salary = salary;
  }

  public Stage getCurrentStage() {
    return currentStage;
  }

  public void setCurrentStage(Stage currentStage) {
    this.currentStage = currentStage;
  }

  public Contact getContact() {
    return contact;
  }

  public void setContact(Contact contact) {
    this.contact = contact;
  }

  public Note getNote() {
    return note;
  }

  public void setNote(Note note) {
    this.note = note;
  }

  public List<StageTransition> getStageTransitions() {
    return stageTransitions;
  }

  public void setStageTransitions(List<StageTransition> stageTransitions) {
    this.stageTransitions = stageTransitions;
  }

}
