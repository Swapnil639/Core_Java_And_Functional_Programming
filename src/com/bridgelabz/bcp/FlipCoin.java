package com.bridgelabz.bcp;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        double heads = 0;
        double tails = 0;
        int count = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter the number :");
        int flips = sc.nextInt();

        while (count <= flips) {
            double random = Math.random();
            System.out.println(count + " " + random);
            if (random <= 0.5) {
                heads++;
            } else {
                tails++;
            }
            count++;
        }
        System.out.println();
        System.out.println("Number of heads :" + heads);
        System.out.println("Number of tails :" + tails);

        double headPercent = heads / flips * 100;
        double tailPercent = tails / flips * 100;

        System.out.println("Percentage of Heads :" + headPercent);
        System.out.println("Percentage of Tails :" + tailPercent);
    }
}