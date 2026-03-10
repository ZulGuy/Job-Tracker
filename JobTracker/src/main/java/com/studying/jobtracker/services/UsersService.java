package com.studying.jobtracker.services;

import com.studying.jobtracker.dto.UserDTO;
import com.studying.jobtracker.entities.User;
import java.util.Optional;

public interface UsersService {

  Optional<User> findById(int id);
  Optional<User> findByEmail(String email);
  Optional<User> findByName(String name);
  Optional<User> save(UserDTO dto);
  void delete(int id);
  Optional<User> update(UserDTO dto);

}
