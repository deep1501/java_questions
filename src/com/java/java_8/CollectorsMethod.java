package com.java.java_8;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsMethod {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();

        studentList.add(new Student("Paul", 11, "Economics", 78.9));
        studentList.add(new Student("Zevin", 12, "Computer Science", 91.2));
        studentList.add(new Student("Harish", 13, "History", 83.7));
        studentList.add(new Student("Xiano", 14, "Literature", 71.5));
        studentList.add(new Student("Soumya", 15, "Economics", 77.5));
        studentList.add(new Student("Asif", 16, "Mathematics", 89.4));
        studentList.add(new Student("Nihira", 17, "Computer Science", 84.6));
        studentList.add(new Student("Mitshu", 18, "History", 73.5));
        studentList.add(new Student("Vijay", 19, "Mathematics", 92.8));
        studentList.add(new Student("Harry", 20, "History", 71.9));
        top3Student(studentList);
        namesAndPercentage(studentList);
        distinctSubject(studentList);
    }

    //    Collectors.toList()
    public static void top3Student(List<Student> students){
        List<Student> collect = students.stream().sorted(Comparator.comparingDouble(Student::getPercentage)).collect(Collectors.toList());
        System.out.println(collect);
    }
    //    Collectors.toMap()
    public static void namesAndPercentage(List<Student> students){
        Map<String, Double> collect = students.stream().collect(Collectors.toMap(student -> student.getName(), student -> student.getPercentage()));
        System.out.println(collect);
    }
    //    Collectors.toSet()
    public static void distinctSubject(List<Student> students){
        Set<String> collect = students.stream().map(student -> student.getSubject()).collect(Collectors.toSet());
        System.out.println(collect);
    }
    //    Collectors.toCollection()
//    public static void collectFirstThreeStudentIntoLinkedList(List<Student> students){
//
//    }
}
