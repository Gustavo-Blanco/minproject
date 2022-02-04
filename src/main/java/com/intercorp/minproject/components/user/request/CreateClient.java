package com.intercorp.minproject.components.user.request;

import com.intercorp.minproject.components.user.User;
import com.intercorp.minproject.components.user.useCase.DeadDay;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CreateClient {

    private String name;
    private String lastname;
    private Integer age;
    private String birthDay;

    public CreateClient() {
    }

    public CreateClient(String name, String lastname, Integer age, String birthDay) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.birthDay = birthDay;
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

    public Date parseDate(String birthDay) throws ParseException {
        return new SimpleDateFormat("dd/mm/yyyy").parse(birthDay);
    }


    public User setToUserFields() throws ParseException {
        Date birthDay = parseDate(this.birthDay);
        return new User(
                this.lastname,
                this.name,
                this.age,
                birthDay,
                parseDate(new DeadDay().calcDeadDate(birthDay))
        );
    }

    @Override
    public String toString() {
        return "CreateClient{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", birthDay='" + birthDay + '\'' +
                '}';
    }
}
