package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {

    public static void addd() {

        ArrayList<String> people = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        String empl = in.nextLine();
        people.add(empl);
    }
    
    public static void print() {
        ArrayList<String> people = new ArrayList<String>();
        people.add("fghds");
        for (int i = 0; i < people.size(); i++) {
           System.out.println(people.get(i));
        }
    }
}
