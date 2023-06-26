package com.bridgelabz.bcp;

import java.util.Scanner;

public class AlphabetVowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter one character to find Vowel or Consonant :");
        char  ch=scanner.next().charAt(0);

        switch (ch){
            case'a':
                System.out.println(ch+" is Vowel");
                break;
            case 'e':
                System.out.println(ch+" is Vowel");
                break;
            case'i':
                System.out.println(ch+" is Vowel");
                break;
            case 'o':
                System.out.println(ch+" is Vowel");
                break;
            case'u':
                System.out.println(ch+" is Vowel");
                break;
            case'A':
                System.out.println(ch+" is Vowel");
                break;
            case 'E':
                System.out.println(ch+" is Vowel");
                break;
            case'I':
                System.out.println(ch+" is Vowel");
                break;
            case 'O':
                System.out.println(ch+" is Vowel");
                break;
            case'U':
                System.out.println(ch+" is Vowel");
                break;
            default:
                System.out.println(ch+" is Consonant");
                break;
        }
    }
}
