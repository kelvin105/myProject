package com.sdhy.domain;

import java.util.Date;

public class Student {

    private int age;
    private String name;
    private Date birthday;
    private String hobby;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", hobby='" + hobby + '\'' +
                '}';
    }

    public Student() {
    }

    public Student(int age, String name, Date birthday, String hobby) {
        this.age = age;
        this.name = name;
        this.birthday = birthday;
        this.hobby = hobby;
    }
}
