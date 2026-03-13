package com.davi.userapi.service;


import com.davi.userapi.repository.UserRepository;
import com.davi.userapi.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> findAll() {
        return repository.findAll();
    }

    public User save(User user) {
        return repository.save(user);
    }

    public User findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public User update(Long id, User user) {
          user.setId(id);

          return repository.save(user);
    }
}
