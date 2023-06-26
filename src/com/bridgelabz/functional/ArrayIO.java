package com.bridgelabz;

import java.util.Scanner;
import java.io.PrintWriter;

public class ArrayIO {

    public static int[][] readInt2DArray(Scanner scanner, int rows, int cols) {
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        return arr;
    }


    public static void print2DArray(PrintWriter writer, int[][] arr) {
        for (int[] row : arr) {
            for (int num : row) {
                writer.print(num + " ");
                writer.flush();
            }
            writer.println();
        }
        writer.close();
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two number :");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] intArr = readInt2DArray(scanner, rows, cols);
        print2DArray(new PrintWriter(System.out), intArr);

    }
}