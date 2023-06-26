package com.bridgelabz;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int delta = b * b - 4 * a * c;
        double x1 = (-b + Math.sqrt(delta) / (2 * a));
        double x2 = (-b - Math.sqrt(delta) / (2 * a));

        System.out.println(x1);
        System.out.println(x2);

        double eq1 = a * x1 * x1 + b * x1 + c;
        System.out.println(eq1);
        double eq2 = a * x2 * x2 + b * x2 + c;
        System.out.println(eq2);
    }
}
