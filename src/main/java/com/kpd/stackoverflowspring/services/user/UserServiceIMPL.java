package com.kpd.stackoverflowspring.services.user;

import com.kpd.stackoverflowspring.dtos.UserDTO;
import com.kpd.stackoverflowspring.dtos.signupDTO;
import com.kpd.stackoverflowspring.entities.User;
import com.kpd.stackoverflowspring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceIMPL implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDTO createUser(signupDTO signupDTO) {

        User user = new User();
        user.setEmail(signupDTO.getEmail());
        user.setName(signupDTO.getName());
        user.setPassword(new BCryptPasswordEncoder().encode(signupDTO.getPassword()));

        User createdUser = userRepository.save(user);

        UserDTO createdUserDTO = new UserDTO();
        createdUserDTO.setId(createdUser.getId());

        return createdUserDTO;
    }
}
