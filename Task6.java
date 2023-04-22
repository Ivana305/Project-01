package Project1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
// Write a java program to check whether a given number is prime or not?
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to check if it is prime number or  not.");
        int number = scanner.nextInt();
        boolean prime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0 && number%2==0) {
                prime = false;
            }
        }
        if (prime && number>1) {
            System.out.println("Number " + number + " is  prime");
        } else {
            System.out.println("Number " + number + " is not prime");
        }
    }
}



