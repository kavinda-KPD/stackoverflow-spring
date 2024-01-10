package com.kpd.stackoverflowspring.services.user;

import com.kpd.stackoverflowspring.dtos.UserDTO;
import com.kpd.stackoverflowspring.dtos.signupDTO;

public interface UserService {
    UserDTO createUser(signupDTO signupDTO);

    boolean hasUserWithEmail(String email);
}
