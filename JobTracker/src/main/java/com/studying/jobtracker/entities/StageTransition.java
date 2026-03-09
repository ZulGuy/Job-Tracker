package com.studying.jobtracker.entities;

import com.studying.jobtracker.utils.Stage;
import java.time.Instant;

public class StageTransition {

  private int id;
  private Stage from;
  private Stage to;
  private Instant changedAt;
  private Vacancy vacancy;
  private User user;

  public StageTransition(int id, Stage from, Stage to, Instant changedAt, Vacancy vacancy,
      User user) {
    this.id = id;
    this.from = from;
    this.to = to;
    this.changedAt = changedAt;
    this.vacancy = vacancy;
    this.user = user;
  }

  public StageTransition() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Stage getFrom() {
    return from;
  }

  public void setFrom(Stage from) {
    this.from = from;
  }

  public Stage getTo() {
    return to;
  }

  public void setTo(Stage to) {
    this.to = to;
  }

  public Instant getChangedAt() {
    return changedAt;
  }

  public void setChangedAt(Instant changedAt) {
    this.changedAt = changedAt;
  }

  public Vacancy getVacancy() {
    return vacancy;
  }

  public void setVacancy(Vacancy vacancy) {
    this.vacancy = vacancy;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }
}
