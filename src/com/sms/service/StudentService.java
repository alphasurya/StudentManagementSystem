package com.sms.service;

import com.sms.model.Student;

public class StudentService {

    Student students[]=new Student[100];
   public int count=0;

    public void addStudent(Student student)
    {
        if (count<students.length)
        {
            students[count++]=student;
            System.out.println("Student "+student.getName()+" has been added \n\n");
        }else
        {
            System.out.println("Students limit Exceeds");
        }
    }

    public Student[] getAllStudent()
    {
           return students;
    }

    public Student searchByRoll(int roll)
    {
        for (int i=0;i<count;i++)
        {
             if (students[i].getRoll()==roll)
             {
                 return students[i];
             }
        }
        System.out.println("Student not found");
        return null;
    }
}
