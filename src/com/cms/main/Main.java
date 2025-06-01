package com.cms.main;

import com.sms.model.Student;
import com.sms.service.StudentService;

import java.util.Scanner;

// ✅ Changed class name to start with uppercase (Java convention)
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ✅ Changed: Created an instance of StudentService
        StudentService studentService = new StudentService();
        int option;
        System.out.println("\n\n Welcome to Student Management System");

        do {

            System.out.println("Please select the option:");
            System.out.println("1. Add New Student. \n2. Print All Students. \n3. Search By Roll. \n4. Exit \n");
            option = sc.nextInt();
            sc.nextLine(); // ✅ Added to consume newline after nextInt

            switch (option) {
                case 1:
                    System.out.println("Enter Name:");
                    String name = sc.nextLine();
                    System.out.println("Enter Age:");
                    int age = sc.nextInt();
                    System.out.println("Enter Roll:");
                    int roll = sc.nextInt();
                    sc.nextLine(); // ✅ Added to consume newline before reading course

                    // ✅ Added missing prompt for course
                    System.out.println("Enter Course:");
                    String course = sc.nextLine();

                    Student student = new Student(name, age, roll, course);

                    // ✅ Changed: Using the instance to call method
                    studentService.addStudent(student);
                    break;

                case 2:
                    // ✅ Changed: Using instance instead of static access
                    Student[] students = studentService.getAllStudent();
                    int count = studentService.count;

                    for (int i = 0; i < count; i++) {
                        System.out.println("Name: " + students[i].getName() +
                                ", Age: " + students[i].getAge() +
                                ", Roll: " + students[i].getRoll() +
                                ", Course: " + students[i].getCourse());
                    }
                    break;

                case 3:
                    System.out.println("Enter Roll:");
                    int rollNo = sc.nextInt();

                    // ✅ Changed: Using instance instead of static access
                    Student student1 = studentService.searchByRoll(rollNo);

                    if (student1 != null) {
                        System.out.println("Name: " + student1.getName() +
                                ", Age: " + student1.getAge() +
                                ", Roll: " + student1.getRoll() +
                                ", Course: " + student1.getCourse());
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Input");
            }

        } while (option != 4);
    }
}
