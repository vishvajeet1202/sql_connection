package com.example.SQL_connection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //so hibernate can identify whose attributes to pick for the table
@Table(name = "user_info")//this for the table mane, Default : tableName == className
public class User {
    @Id // it written on that which has to become primary key and private
    private int id;//it is private key
    private String name;
    private int age;
    private String mobNo;

    //always to default constructor
    User(){

    }

    public User(int id, String name, int age,String mobNo) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mobNo=mobNo;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
