package com.srisha.WebProject.model;

public class User {
    private String name;
    private String image;
    private Integer id;
    private String gender;
    public User(){

    }
    public User(String name, String image, Integer id, String gender){
        this.name = name;
        this.image = image;
        this.id = id;
        this.gender = gender;
    }
    public String getName(){
        return this.name;
    }
    public String getImage(){
        return this.image;
    }
    public Integer getId(){
        return this.id;
    }
    public String getGender(){
        return this.gender;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setImage(String image){
        this.image = image;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    
}
