package com.company;

import java.util.ArrayList;


public class EmployeeList {

    private static ArrayList<Employee> people = new ArrayList<Employee>();

    //Add
    public void Add(String Name,String Surname,String Position, double Salary) {
        Employee e = new Employee(Name, Surname, Position, Salary);
        people.add(e);
    }

    //print
    public void print(){
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i).toString());
        }
    }
    //Search
    public void search(String Position)
    {   ArrayList<Employee> tmp = new ArrayList<Employee>();
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).getPosition().equals(Position)){
                tmp.add(people.get(i));
            }
        }
        if (tmp.size()>0) {
        for (int i = 0; i <tmp.size() ; i++) {

                System.out.println(tmp.get(i).toString());
            }
        }
        else {
            System.out.println("No rows with "+Position+" Position");
                }

    }

    //sort
        public void sort(String by){
            switch (by.toUpperCase()){
                case "SALARY":

                    break;

                default:
                        System.out.println("no sort");
                        break;

            }
        }
}

