package com.bridgelabz.bcp;

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        int result=1,base=2;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter power");
        int power=scanner.nextInt();
        for (int i = 1; i <=power; i++) {
            result=result*base;
        }
        System.out.println(result);
    }
}
