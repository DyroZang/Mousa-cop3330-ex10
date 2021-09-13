/*
 *  UCF COP3330 Fall 2021 Assignment 10 Solution
 *  Copyright 2021 Gabriel Mousa
 */

import java.util.Scanner;


public class App{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the price of item 1: ");
        int p1 = Integer.parseInt(input.nextLine());
        System.out.println("Enter the quantity of item 1:" );
        int q1 = Integer.parseInt(input.nextLine());

        System.out.println("Enter the price of item 2: ");
        int p2 = Integer.parseInt(input.nextLine());
        System.out.println("Enter the quantity of item 2: ");
        int q2 = Integer.parseInt(input.nextLine());

        System.out.println("Enter the price of item 3:");
        int p3 = Integer.parseInt(input.nextLine());
        System.out.println("Enter the quantity of item 3:");
        int q3 = Integer.parseInt(input.nextLine());

        double subtotal = p1*q1 + p2*q2 + p3*q3;
        double tax = subtotal*.055;
        double total = subtotal + tax;
        String subt = String.format("$%.2f",subtotal);
        String stax = String.format("$%.2f", tax);
        String stotal = String.format("$%.2f", total);

        System.out.println("Subtotal: " + subt + "\nTax: " + stax + "\nTotal: " + stotal);
    }
}