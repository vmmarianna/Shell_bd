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
    }

    private void add() {
        System.out.println("Data Input:");
        System.out.println("Name: ");
        String name = scanner.nextLine();
        System.out.println("Surname: ");
        String surname = scanner.nextLine();
        System.out.println("Position: ");
        String position = scanner.nextLine();
        System.out.println("Salary: ");
        double salary = -1.0;
        try {
            salary = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Salary is not double");

        }

        employees.add(name, surname, position, salary);
        scanner.nextLine();
    }

    private void help() {
        System.out.println("ADD");
        System.out.println("PRINT");
        System.out.println("SEARCH");
        System.out.println("SORT");
    }
}
