package com.studying.jobtracker.entities;

public class Note {

  private int id;
  private String content;
  private User user;

  public Note(int id, String content, User user) {
    this.id = id;
    this.content = content;
    this.user = user;
  }

  public Note() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }
}
