package com.bridgelabz;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 3 integer number :");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        int large;

        if (a>b && a>c){
            large=a;
        } else if (b>a && b>c) {
            large=b;
        }else {
            large=c;
        }
        System.out.println("Largest number: "+large);
    }
}
