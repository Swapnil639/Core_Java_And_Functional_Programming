package com.bridgelabz.bcp;

import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        int dividend, divisor;
        System.out.println("Enter Value :");
        Scanner scanner = new Scanner(System.in);
        dividend = scanner.nextInt();
        divisor = scanner.nextInt();
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
    }
}
