package ru.job4j.pojo;

import java.util.Date;

public class Collage {
    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentName("Kirill Ivanov");
        student.setGroup("401");
        student.setData(new Date());

        System.out.println(student.getStudentName() + " / Группа - " + student.getGroup() + " / Дата поступления - " + student.getData());
    }
}