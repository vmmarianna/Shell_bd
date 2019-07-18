package com.company;

import javax.naming.Name;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Handler {
    EmployeeList el = new EmployeeList();
    Scanner sc = new Scanner(System.in);

    public void serve() {

        while (true) {
            System.out.print("--> ");
            String command = sc.nextLine();
            switch (command.toUpperCase()) {

                case "HELP":
                    help();
                    break;
                case "ADD":
                    add();
                    break;

                case "PRINT":
                    el.print();
                    //command = null;
                    break;

                case "SEARCH":
                    search();
                    break;

                case "SORT":
                    sort();
                    break;

                case "EXIT":
                    System.exit(0);

                default:
                    System.out.println(command + " Not Found");
                    break;
            }

        }
    }

    private void sort() {
        System.out.print("Sort : ");
        String by = sc.nextLine();
        el.sort(by);
    }

    private void search() {
        System.out.print("Search by post : ");
        String tmp = sc.nextLine();
        el.search(tmp);
        //System.out.println("\n\n\n");
        //sc.nextLine();
    }

    private void add() {
        System.out.println("Data Input:");
        System.out.println("Name: ");
        String n = sc.nextLine();
        System.out.println("Surname: ");
        String s = sc.nextLine();
        System.out.println("Position: ");
        String p = sc.nextLine();
        System.out.println("Salary: ");
        double slr = -1.0;
        try {
            slr = sc.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Salary is not double");
        }
        el.Add(n, s, p, slr);
        sc.nextLine();
        //command=null;
    }

    private void help() {
        System.out.println("ADD");
        System.out.println("PRINT");
        System.out.println("SEARCH");
        System.out.println("SORT");
    }
}
