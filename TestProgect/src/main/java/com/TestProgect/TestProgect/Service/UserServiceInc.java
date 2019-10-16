package com.TestProgect.TestProgect.Service;

import com.TestProgect.TestProgect.Entity.UserClass;

import java.util.List;

public interface UserServiceInc {
    UserClass save(UserClass user);

    void delete(UserClass user);

    UserClass update(UserClass user);

    List<UserClass> findAll();

    UserClass findByFirstName(String name);
}
