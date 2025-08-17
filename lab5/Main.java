package lab5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);
        System.out.println("Enter a number 1: ");
        int number1 = num1.nextInt();
        System.out.println("Enter a number 2: ");
        int number2 = num2.nextInt();
        int sum = number1 + number2;
        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + sum);
    }
}
