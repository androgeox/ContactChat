package com.georgiy.contactchat.service;

import com.georgiy.contactchat.entity.User;
import org.springframework.transaction.annotation.Transactional;
import com.georgiy.contactchat.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User findUser(User user){
        return userRepository.findOne(user.getId());
    }

    public User findUserByLogin(String login){
        return userRepository.findByLogin(login);
    }
}
