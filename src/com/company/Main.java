package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        boolean cn = true;

          while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter an exam score: ");
            int score = sc.nextInt();

            if (score >= 97) {
                System.out.println("A+");
            } else if (score >= 94) {
                System.out.println("A");
            } else if (score >= 90) {
                System.out.println("A-");
            } else if (score >= 87) {
                System.out.println("B+");
            } else if (score >= 84) {
                System.out.println("B");
            } else if (score >= 80) {
                System.out.println("B-");
            } else if (score >= 77) {
                System.out.println("C+");
            } else if (score >= 74) {
                System.out.println("C");
            } else if (score >= 70) {
                System.out.println("C-");
            } else if (score >= 60) {
                System.out.println("D");
            } else {
                System.out.println("Go back to school.");
            }

            System.out.println("Do you want another score? (true/false)");
            boolean answer = sc.nextBoolean();
            if (answer == false) {
                break;
            }

        }
    }
}