package com.company;

import java.io.IOException;

public class handler {

    public  static void handler(String comand) throws IOException {

        switch (comand) {
            case "add":
               Employee.addd();
               break;
            case "print":
                Employee.print();
                break;
            default:
                System.out.println(comand + " Not found");
        }

    }
}
