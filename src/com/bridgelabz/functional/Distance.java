package com.bridgelabz.functional;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        double distance=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        System.out.println("Euclidean distance: "+distance);
    }
}
