package com.lamdasandstreams;

public class Student{
    public int id;
    public String name;
    public int age;
    public String gender;
    public String engDepartment;
    public int yearOfEnrollment;
    public double perTillDate;
    Student(int id,String name,int age,String gender,String engDepartment,int yearOfEnrollment,double perTillDate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.engDepartment = engDepartment;
        this.yearOfEnrollment = yearOfEnrollment;
        this.perTillDate = perTillDate;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getPerTillDate() {
        return perTillDate;
    }

    public int getYearOfEnrollment() {
        return yearOfEnrollment;
    }

    public String getEngDepartment() {
        return engDepartment;
    }

    public String getGender() {
        return gender;
    }
    public String toString(){
        return "Name:"+name+"\nid:"+id+"\nage:"+age+"\ngender:"+gender+"\nDepartment:"
                +engDepartment+"\nEnrollment Year:"+yearOfEnrollment+"\nPercentage:"+perTillDate;
    }

}