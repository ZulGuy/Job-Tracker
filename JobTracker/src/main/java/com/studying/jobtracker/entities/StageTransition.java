package com.studying.jobtracker.entities;

import com.studying.jobtracker.utils.Stage;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import java.time.Instant;

@Entity(name = "stage_transitions")
public class StageTransition {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  @Column(name = "from")
  private Stage from;
  @Column(name = "to")
  private Stage to;
  @Column(name = "changed_at")
  private Instant changedAt;
  @ManyToOne
  @JoinColumn(name = "vacancy_id")
  private Vacancy vacancy;
  @ManyToOne
  @JoinColumn(name = "user_id")
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
