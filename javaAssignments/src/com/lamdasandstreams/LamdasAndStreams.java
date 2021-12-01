package com.lamdasandstreams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LamdasAndStreams {

    public static void main(String[] args) {
        List<Student> studentList = getStudents();
        //1.
        System.out.println("Departments in College : ");
        studentList.stream().map(i->i.engDepartment).collect(Collectors.toSet()).forEach(System.out::println);

        //2.
        System.out.println("Names of students enrolled after 2018 : ");
        List<String> departmentList = studentList.stream().filter(i->i.yearOfEnrollment>2018).map(i->i.name).collect(Collectors.toList());
        studentList.stream().filter(i->i.yearOfEnrollment>2018).map(i->i.name).collect(Collectors.toList()).forEach(System.out::println);

        //3.
        System.out.println("Male students pursuing Computer Science : ");
        studentList.stream().filter(i->i.gender.equals("Male") && i.engDepartment.equals("Computer Science")).map(i->i.id+":"+i.name).collect(Collectors.toList()).forEach(System.out::println);

        //4.
        System.out.println("Male and Female Count :");
        var maleCount = studentList.stream().collect(Collectors.groupingBy(i->i.gender)).get("Male").size();
        var femaleCount = studentList.stream().collect(Collectors.groupingBy(i->i.gender)).get("Female").size();
        System.out.println("Male : "+maleCount+" Female : "+femaleCount);

        //5.
        System.out.println("Average age of male and female");
        var sumOfMaleAges = studentList.stream().filter(i->i.gender.equals("Male")).mapToInt(i->i.age).sum();
        var sumOfFemaleAges = studentList.stream().filter(i->i.gender.equals("Female")).mapToInt(i->i.age).sum();
        System.out.println("Average male age : "+(sumOfMaleAges/maleCount)+"\n"+"Average female age : " + (sumOfFemaleAges/femaleCount));

        //6.
        System.out.println("Student having highest percentage : ");
        System.out.println( studentList.stream().min((i,j)->i.perTillDate>j.perTillDate?-1:+1).get().toString());

        //7.
        System.out.println("Number of students in each department : ");
        var studentsInDepartment = studentList.stream().collect(Collectors.groupingBy(i->i.engDepartment,Collectors.counting()));
        System.out.println(studentsInDepartment);

        //8.
        System.out.println("Average percentage achieved in each department: ");
        for (String dep:studentList.stream().map(i->i.engDepartment).collect(Collectors.toSet()))
        {
            var computerScience=  studentList.stream().filter(i->i.engDepartment.equals(dep)).mapToDouble(i->i.perTillDate).sum();
            var average = computerScience/studentsInDepartment.get(dep);
            System.out.println(dep+" : " + average);
        }

        //9.
        System.out.println("Details of youngest Male student in Electronic Department");
        var minAgeInElectronic = studentList.stream().filter(i->i.engDepartment.equals("Electronic") && i.gender.equals("Male") ).collect(Collectors.minBy((i,j)->i.age< j.age?-1:i.age>j.age?+1:0)).get();
        System.out.println(minAgeInElectronic.toString());

        //10.
        System.out.println("Male and Female Count in Computer Science department:");
        var maleCountInComputerScienceDepartment = studentList.stream().filter(i->i.engDepartment.equals("Computer Science")).collect(Collectors.groupingBy(i->i.gender)).get("Male").size();
        var femaleCountInComputerScienceDepartment = studentList.stream().filter(i->i.engDepartment.equals("Computer Science")).collect(Collectors.groupingBy(i->i.gender)).get("Female").size();
        System.out.println("Male : "+maleCountInComputerScienceDepartment+" Female : "+femaleCountInComputerScienceDepartment);

    }

    private static List<Student> getStudents() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        studentList.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        studentList.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        studentList.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        studentList.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        studentList.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        studentList.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        studentList.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        studentList.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        studentList.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        studentList.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        studentList.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        studentList.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        studentList.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        studentList.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        studentList.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electrical", 2019, 72.4));
        studentList.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));
        return studentList;
    }
}
