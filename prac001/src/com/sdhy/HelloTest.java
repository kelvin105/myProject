package com.sdhy;

import com.sdhy.domain.Student;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HelloTest {

    public static void main(String[] args) {
        System.out.println("hello world");
        List<Student> list001 = new ArrayList<Student>();
        Student stu001 = new Student();
        stu001.setAge(18);
        stu001.setBirthday(new Date());
        stu001.setHobby("夜空中个最亮的新星星");
        stu001.setName("静夜思01");
        Student stu002 = new Student();
        stu002.setAge(18);
        stu002.setBirthday(new Date());
        stu002.setHobby("夜空中个最亮的新星星");
        stu002.setName("静夜思02");
        Student stu003 = new Student();
        stu003.setAge(18);
        stu003.setBirthday(new Date());
        stu003.setHobby("夜空中个最亮的新星星");
        stu003.setName("静夜思03");
        list001.add(stu001);
        list001.add(stu002);
        list001.add(stu003);

    }
}
