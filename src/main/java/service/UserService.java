package service;

import dto.UserDto;
import model.User;

import java.util.Optional;

public interface UserService {

    void save(UserDto userDto);

    Optional<User> findByUsername(String username);

}