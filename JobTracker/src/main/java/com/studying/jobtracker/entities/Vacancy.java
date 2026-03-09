package com.studying.jobtracker.entities;

import com.studying.jobtracker.utils.Stage;
import jakarta.validation.Valid;
import java.util.List;

public class Vacancy {

  private int id;
  private String name;
  private String description;
  private String requirements;
  private String salary;
  private Stage currentStage;
  @Valid
  private Contact contact;
  @Valid
  private Note note;

  private List<StageTransition> stageTransitions;

  public Vacancy(int id, String name, String description, String requirements, String salary, Stage currentStage,
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

  public Vacancy(int id, String name, String description, String requirements, String salary,
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
