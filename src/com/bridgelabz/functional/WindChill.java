package com.bridgelabz.functional;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number :");
        int t = scanner.nextInt();
        int v = scanner.nextInt();
        if (t>50 || v<3 || v>120) {
            System.out.println("Invalid input. Temperature must be less than 50 in absolute value and wind speed must be between 3 and 120.");
            return;
        }
            double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
            System.out.println(w);
    }
}
