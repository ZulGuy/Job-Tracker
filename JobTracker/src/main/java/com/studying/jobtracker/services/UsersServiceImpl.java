package com.studying.jobtracker.services;

import com.studying.jobtracker.dto.UserDTO;
import com.studying.jobtracker.entities.User;
import com.studying.jobtracker.repositories.UsersRepository;
import jakarta.persistence.EntityNotFoundException;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {

  private final UsersRepository usersRepository;

  @Autowired
  public UsersServiceImpl(UsersRepository usersRepository) {
    this.usersRepository = usersRepository;
  }

  @Override
  public User findById(int id) {
    return usersRepository.findById(id)
        .orElseThrow(() -> new EntityNotFoundException("User not found"));
  }

  @Override
  public User findByEmail(String email) {
    return usersRepository.findByEmail(email)
        .orElseThrow(() -> new EntityNotFoundException("User not found"));
  }

  @Override
  public User findByName(String name) {
    return usersRepository.findByName(name)
        .orElseThrow(() -> new EntityNotFoundException("User not found"));
  }

  @Override
  public User save(UserDTO dto) {
    User user = toEntity(dto);
    usersRepository.save(user);
    if(usersRepository.findByEmail(dto.email()).isPresent())
      return usersRepository.findByEmail(dto.email()).get();
    throw new EntityNotFoundException("User is not saved");
  }

  @Override
  public void delete(int id) {
    usersRepository.deleteById(id);
  }

  @Override
  public User update(UserDTO dto) {
    User user = toEntity(dto);
    usersRepository.save(user);
    if(usersRepository.findByEmail(dto.email()).isPresent())
      return usersRepository.findByEmail(dto.email()).get();
    throw new EntityNotFoundException("User is not updated");
  }

  private User toEntity(UserDTO dto) {
    User user = new User();
    user.setEmail(dto.email());
    user.setName(dto.name());
    user.setDescription(dto.description());
    user.setExperience(dto.experience());
    user.setSkills(dto.skills());
    user.setNumber(dto.number());
    user.setSocials(dto.socials());
    return user;
  }
}
