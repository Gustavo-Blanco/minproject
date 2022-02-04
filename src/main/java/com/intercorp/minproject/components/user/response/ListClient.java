package com.intercorp.minproject.components.user.response;

import com.intercorp.minproject.components.user.User;

import java.util.List;

public class ListClient {

    private String name;
    private String lastname;
    private Integer age;
    private String birthDay;
    private String deadDate;

    public ListClient() {
    }

    public ListClient(String name, String lastname, Integer age, String birthDay, String deadDate) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.birthDay = birthDay;
        this.deadDate = deadDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getDeadDate() {
        return deadDate;
    }

    public void setDeadDate(String deadDate) {
        this.deadDate = deadDate;
    }
}
