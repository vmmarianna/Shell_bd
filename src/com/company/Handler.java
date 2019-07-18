package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Handler {
    EmployeeList employees = new EmployeeList();
    Scanner scanner = new Scanner(System.in);

    public void serve() {

        while (true) {
            System.out.print("--> ");
            String command = scanner.nextLine();
            switch (command.toUpperCase()) {

                case "HELP":
                    help();
                    break;
                case "ADD":
                    add();
                    break;

                case "PRINT":
                    employees.print();
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
        String by = scanner.nextLine();
        employees.sort(by);
    }

    private void search() {
        System.out.print("Search by post : ");
        String tmp = scanner.nextLine();
        employees.search(tmp);
        //System.out.println("\n\n\n");
        //scanner.nextLine();
    }

    private void add() {
        System.out.println("Data Input:");
        System.out.println("Name: ");
        String n = scanner.nextLine();
        System.out.println("Surname: ");
        String s = scanner.nextLine();
        System.out.println("Position: ");
        String p = scanner.nextLine();
        System.out.println("Salary: ");
        double slr = -1.0;
        try {
            slr = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Salary is not double");
        }
        employees.add(n, s, p, slr);
        scanner.nextLine();
        //command=null;
    }

    private void help() {
        System.out.println("ADD");
        System.out.println("PRINT");
        System.out.println("SEARCH");
        System.out.println("SORT");
    }
}
