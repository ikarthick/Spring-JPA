package com.srikar.learning.jpa.learnjpa.dao;

import com.srikar.learning.jpa.learnjpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>{

}
