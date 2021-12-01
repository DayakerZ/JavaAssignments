package com.lambdasandstremspractice;

import java.util.*;
import java.util.stream.Collectors;

class Employee{
    String name;
    int EmployeeId;
    Employee(String name,int EmployeeId){
        this.name = name;
        this.EmployeeId = EmployeeId;
    }
    public String toString(){
        return name+":"+EmployeeId;
    }
}
public class PracticeSix {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Dayaker",2451125));
        employees.add(new Employee("Amith Sai",2451146));
        employees.add(new Employee("Saileshwar",2451127));
        employees.add(new Employee("Goutham",2451122));
        // Ascending order with respect to name of the employee
        Collections.sort(employees,(e1,e2)->e1.name.compareTo(e2.name));
        System.out.println(employees);
        // Descending order with respect to employee id
        Collections.sort(employees,(e1,e2)->e1.EmployeeId< e2.EmployeeId?+1:-1);
        System.out.println(employees);

        Comparator<Employee> comparator = (e,f)->{
                if(e.name.length()>f.name.length())
                    return 1;
                else if(e.name.length()<f.name.length())
                    return -1;
                else
                    return e.name.compareTo(f.name);

        };

        List<Employee> customSortedList = employees.stream().sorted(comparator).collect(Collectors.toList());
        System.out.println(customSortedList);
    }
}
