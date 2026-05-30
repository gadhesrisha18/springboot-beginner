package com.srisha.WebProject.service;
import java.util.*;
import com.srisha.WebProject.model.*;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private List<User> allUsers;

    public UserService(){
        allUsers = new ArrayList<>(); // Empty Array List
        allUsers.add(new User("Anasurya",  "/img/john.png", 1,"Male"));
        allUsers.add(new User("Srisha", "/img/img_avatar2.png", 2, "Female"));
    }
    
    // Name is of our choice
    public List<User> getAllUsers(){
        return allUsers;
    }

    public User getOneUser(int id){
        for(int i = 0; i < allUsers.size(); i++){
            User u = allUsers.get(i);
            if(u.getId() == id){
                return u;
            }
        }
        return null;
    }

    public User createUser(User u){
        allUsers.add(u);
        return u;
    }

    public User updateUser(int id, User user){
        for(int i = 0; i < allUsers.size(); i++){
            User u = allUsers.get(i);
            if(u.getId() == id){
                allUsers.set(i, user);
                return u;
            }
        }
        return null;
    }
    public void deleteUser(int id){
        for(int i = 0; i < allUsers.size(); i++){
            User u = allUsers.get(i);
            if(u.getId() == id){
                allUsers.remove(i);
                break;
            }
        }
    }
}

