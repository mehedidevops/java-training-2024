package com.syntexpro;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to my calculator");

        System.out.println("Enter a number (int)");

        int store1 = input.nextInt();

        System.out.println("Enter another number (int)");
        int store2 = input.nextInt();

        int result = store1 + store2;

        System.out.println("Total result = " + result);


    }


}
