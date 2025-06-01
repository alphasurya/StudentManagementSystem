package com.sms.model;

public class Student extends person
{
  private int roll;
  private   String course;

  public Student(String name,int age, int roll,String course)
  {
      super(name,age);
      this.roll=roll;
      this.course=course;
  }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
