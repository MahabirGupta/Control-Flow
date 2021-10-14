package com.generation.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your sales figure: ");
        int sales = Integer.parseInt(input.nextLine());
        double commision;
        if (sales > 10000) {
            commision = 0.30 * sales;
            System.out.println("Your commision is: " + commision);
        } else if (sales>=5001 && sales<=10000){
            commision = 0.20 * sales;
            System.out.println("Your commision is: " + commision);
        }
        else if (sales>=1000 && sales<=5000){
            commision = 0.10 * sales;
            System.out.println("Your commision is: " + commision);
        }
        else {
            System.out.println("Your sales is below $1000. You are not eligible for any commision");
        }
    }
}
