package com.bridgelabz;

import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int N = sc.nextInt();
                System.out.print("Prime factors of " + N + ": ");
                for (int i = 2; i * i <= N; i++) {
                    while (N % i == 0) {
                        System.out.print(i + " ");
                        N /= i;
                    }
                }
                if (N > 1) {
                    System.out.print(N);
                }
            }

}
