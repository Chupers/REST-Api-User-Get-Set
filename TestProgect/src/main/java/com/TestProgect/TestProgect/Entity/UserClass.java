package com.TestProgect.TestProgect.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Getter
@Setter
@AllArgsConstructor
@Entity
public class UserClass {
        @Id
        @GeneratedValue
        long id;

        String firstName;

        int age;

        public UserClass() {
        }
    }


