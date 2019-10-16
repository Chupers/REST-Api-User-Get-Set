package com.TestProgect.TestProgect.Service;

import com.TestProgect.TestProgect.Entity.UserClass;
import com.TestProgect.TestProgect.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService implements UserServiceInc {
    @Autowired
    UserRepository userRepository;
    @Override
    public UserClass save(UserClass user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(UserClass user) {
        userRepository.delete(user);
    }

    @Override
    public UserClass update(UserClass user) {
        return  null;
    }

    @Override
    public List<UserClass> findAll() {
       return userRepository.findAllBy();
    }

    @Override
    public UserClass findByFirstName(String name) {
       return userRepository.findAllByFirstName(name);
    }
}
