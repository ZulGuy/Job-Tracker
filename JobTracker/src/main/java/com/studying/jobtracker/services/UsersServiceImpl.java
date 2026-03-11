package com.studying.jobtracker.services;

import com.studying.jobtracker.dto.UserDTO;
import com.studying.jobtracker.entities.User;
import com.studying.jobtracker.repositories.UsersRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService{

  private final UsersRepository usersRepository;

  @Autowired
  public UsersServiceImpl(UsersRepository usersRepository) {
    this.usersRepository = usersRepository;
  }

  @Override
  public Optional<User> findById(int id) {
    return Optional.empty();
  }

  @Override
  public Optional<User> findByEmail(String email) {
    return Optional.empty();
  }

  @Override
  public Optional<User> findByName(String name) {
    return Optional.empty();
  }

  @Override
  public Optional<User> save(UserDTO dto) {
    return Optional.empty();
  }

  @Override
  public void delete(int id) {

  }

  @Override
  public Optional<User> update(UserDTO dto) {
    return Optional.empty();
  }
}
