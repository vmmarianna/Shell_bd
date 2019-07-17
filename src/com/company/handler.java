package com.company;

import javax.naming.Name;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class handler {
EmployeeList el= new EmployeeList();
Scanner sc = new Scanner(System.in);
    public void serve(){

        while (true) {
            System.out.print("--> ");
            String command=sc.nextLine();
            switch (command.toUpperCase()) {
                case "ADD":
                    System.out.println("Data Input:");
                    System.out.println("Name: ");
                    String n = sc.nextLine();
                    System.out.println("Surname: ");
                    String s = sc.nextLine();
                    System.out.println("Position: ");
                    String p = sc.nextLine();
                    System.out.println("Salary: ");
                    double slr=-1.0;
                    try {
                        slr = sc.nextDouble();
                    }
                    catch (InputMismatchException e){
                        System.out.println("Salary is not double");
                    }
                    el.Add(n,s,p,slr);
                    sc.nextLine();
                    //command=null;
                    break;

                case "PRINT":
                    el.print();
                    //command = null;
                    break;

                case "SEARCH":
                    System.out.print("Search: ");
                    String tmp = sc.nextLine();
                    el.search(tmp);
                    //System.out.println("\n\n\n");
                    //sc.nextLine();
                    break;

                default:
                    System.out.println(command + " Not Found");
                    break;
            }

        }
    }
}
