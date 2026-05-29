package com.srisha.WebProject.service;
import java.util.*;
import com.srisha.WebProject.model.*;
public class UserService {
    private List<User> allUsers;
    public UserService(){
        allUsers=new ArrayList<>();
        allUsers.add(new User("srisha","img/jane.jpg",0,"male"));
        allUsers.add(new User("srisha","img/img_avatar2.jpg",1,"female"));
           }
    public void addUser(String name,String gender,String image){
User newUser = new User(name,image,allUsers.size(),gender);
allUsers.add(newUser);
    }
    public List<User> getAllUsers(){
        return allUsers;
    }
    public User getSingleUser(Integer id){
        return allUsers.get(id);
    }
    public void updateUser(String name,String gender,String image,Integer idx){
       User updUser=new User(name,image,allUsers.size(),gender);
       allUsers.set(idx, updUser);
    }
    public void deleteUser(Integer idx){
        allUsers.remove(idx);
    }
}
