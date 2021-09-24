/*
 *  UCF COP3330 Fall 2021 Assignment 25 Solution
 *  Copyright 2021 Ihosvany Marquez
 */

package Exercise26;

import java.util.Scanner;

public class Solution26
{
    public static int monthsToPayOff(double balance, double apr, double payment)
    {

        apr = apr / 365;
        return (int) Math.ceil((-1 / 30.0) * Math.log(1 + balance / payment
                * (1 - Math.pow(1 + apr, 30))) / Math.log(1 + apr));
    }
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        double balance, apr, payment;

        System.out.print("What is your balance? ");
        balance = scan.nextDouble();

        System.out.print("What is the APR on the card (as a percent)? ");
        apr = scan.nextDouble();

        System.out.print("What is the monthly payment you can make? ");
        payment = scan.nextDouble();

        apr = apr / 100;
        int months = monthsToPayOff(balance, apr, payment);
        System.out.println("It will take " + months + " months to pay off this card.");
    }
}