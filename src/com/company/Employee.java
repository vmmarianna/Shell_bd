package com.company;

import java.util.Comparator;

public class Employee {
    private String Name;
    private String Surname;
    private String Position;
    private Double Salary;

    public Double getSalary() {
        return Salary;
    }

    public String getName() {
        return Name;
    }

    public String getPosition() {
        return Position;
    }

    public String getSurname() {
        return Surname;
    }

    public Employee(String Name, String Surname, String Position, double Salary) {
        this.Name = Name;
        this.Surname = Surname;
        this.Position = Position;
        this.Salary = Salary;
    }

    public String toString() {
        return ("Name: " + this.Name + " Surname: " + this.Surname + " Position: " + this.Position + " Salary: " + this.Salary.toString());
    }


    public static Comparator<Employee> nameComparator = Comparator.comparing(Employee::getName);


    public static Comparator<Employee> surnameComparator = Comparator.comparing(Employee::getSurname);

    public static Comparator<Employee> positionComparator = Comparator.comparing(Employee::getPosition);
    
    public static Comparator<Employee> salaryComparator = Comparator.comparing(Employee::getSalary);

}
