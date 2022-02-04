package com.intercorp.minproject.components.user;

import javax.persistence.*;
import java.util.Date;

@Table
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String lastname;
    private String name;
    private Integer age;
    private Date birthDay;
    private Date deadDate;

    public User(String lastname, String name, Integer age, Date birthDay, Date deadDate) {
        this.lastname = lastname;
        this.name = name;
        this.age = age;
        this.birthDay = birthDay;
        this.deadDate = deadDate;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public Date getDeadDate() {
        return deadDate;
    }

    public void setDeadDate(Date deadDate) {
        this.deadDate = deadDate;
    }
}
