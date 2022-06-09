package com.srikar.learning.jpa.learnjpa.service;

import com.srikar.learning.jpa.learnjpa.dao.UserRepository;
import com.srikar.learning.jpa.learnjpa.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserDAOService {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private UserRepository userRepository;

    // Create a single user
    public User createUser(User user){
        return userRepository.save(user);
    }

    //Create multiple users
    public List<User> createUsers(List<User> user){
        return userRepository.saveAll(user);
    }

    //Get specific user by Id
    public User getUserById(Integer id){

        return userRepository.findById(id).orElse(null);
    }

    //fetch all users
    public List<User> getUsers(){
        return userRepository.findAll();
    }

    //Update User
    public User updateUser(User user){
        User olduser =null;
        Optional<User> optionalUser = userRepository.findById(user.getId());
        if(optionalUser.isPresent()){
            olduser = optionalUser.get();
            olduser.setName(user.getName());
            olduser.setRole(user.getRole());
            userRepository.save(olduser);
        }
        else {
            return new User();
        }
        return olduser;
    }

    //Delete User
    public String deleteUserById(Integer id){
        userRepository.deleteById(id);
        return "User was deleted Successfully";
    }
}
