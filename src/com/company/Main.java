package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String comand;

        while (true) {
            System.out.print("@>");

            comand = in.nextLine();

            try {
                handler.handler(comand);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}