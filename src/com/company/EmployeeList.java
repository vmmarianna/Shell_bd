package com.company;

import java.util.ArrayList;
import java.util.Comparator;


public class EmployeeList {

    private ArrayList<Employee> people = new ArrayList<Employee>();

    //add
    public void add(String Name, String Surname, String Position, double Salary) {
        Employee e = new Employee(Name, Surname, Position, Salary);
        people.add(e);
    }

    //print
    public void print() {
        printTmp(people);
    }

    //Search
    public void search(String Position) {
        ArrayList<Employee> tmp = getEmployees(Position);
        if (!tmp.isEmpty()) {
            printTmp(tmp);
        } else {
            System.out.println("No rows with " + Position + " Position");
        }
    }

    private void printTmp(ArrayList<Employee> tmp) {
        for (Employee employee : tmp) {
            System.out.println(employee);
        }
    }

    private ArrayList<Employee> getEmployees(String Position) {
        ArrayList<Employee> tmp = new ArrayList<>();
        for (Employee employee : people) {
            if (employee.getPosition().equals(Position)) {
                tmp.add(employee);
            }
        }
        return tmp;
    }

    //sort
    public void sort(String by) {
        switch (by.toUpperCase()) {
            case "SALARY":
                people.sort(Employee.salaryComparator);
                printTmp(people);
                break;
            case "SURNAME":
                people.sort(Employee.surnameComparator);
                printTmp(people);
                break;
            case "NAME":
                people.sort(Employee.nameComparator);
                printTmp(people);
                break;
            case "POSITION":
                people.sort(Employee.positionComparator);
                printTmp(people);
                break;
            default:
                System.out.println("no sort");
                break;

        }
    }
}

