package com.generation.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = Integer.parseInt(input.nextLine());
        float ticketprice;
        float totaldiscountedprice;
        int normalprice = 7;
        if (age < 5) {
            ticketprice = (float) (0.40 * normalprice);
            float roundedFloat = (float) (Math.round(ticketprice * 100.0) / 100.0);
            System.out.println("Please pay:$ " + roundedFloat);
        } else if (age > 60) {
            ticketprice = (float) (0.45 * normalprice);
            float roundedFloat1 = (float) (Math.round(ticketprice * 100.0) / 100.0);
            System.out.println("Please pay:$ " + roundedFloat1);
        } else {
            Scanner input1 = new Scanner(System.in);
            System.out.println("How many tickets do you want to buy: ");
            int numofpeople = Integer.parseInt(input.nextLine());
            if (numofpeople >= 2) {
                totaldiscountedprice = (float) (0.70 * (normalprice * numofpeople));
                float roundedFloat2 = (float) (Math.round(totaldiscountedprice * 100.0) / 100.0);
                System.out.println("Please pay total discounted ticket price:$ " + roundedFloat2);
            }
        }
    }
}

