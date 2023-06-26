package com.bridgelabz;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=scanner.nextInt();
        double result=0.0;
        for (double i = 1.0; i <=n; i++) {
            if (n==0){
                System.out.println("Enter valid input");
            }else {
                result=result+ 1/i;
            }
        }
        System.out.println("Harmonic value :"+result);
    }
}
