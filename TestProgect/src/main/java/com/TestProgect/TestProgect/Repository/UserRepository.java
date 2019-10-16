package com.TestProgect.TestProgect.Repository;

import com.TestProgect.TestProgect.Entity.UserClass;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserRepository extends CrudRepository<UserClass,Long> {
    @Override
    <S extends UserClass> S save(S s);
    UserClass findAllByFirstName(String name);
    List<UserClass> findAllBy();
}
