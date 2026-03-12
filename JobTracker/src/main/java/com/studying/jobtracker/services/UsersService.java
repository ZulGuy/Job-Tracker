package com.studying.jobtracker.services;

import com.studying.jobtracker.dto.UserDTO;
import com.studying.jobtracker.entities.User;
import java.util.Optional;

public interface UsersService {

  User findById(int id);
  User findByEmail(String email);
  User findByName(String name);
  User save(UserDTO dto);
  void delete(int id);
  User update(UserDTO dto);

}
