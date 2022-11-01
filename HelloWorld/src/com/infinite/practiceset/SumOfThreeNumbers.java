package com.infinite.practiceset;

import java.util.Scanner;

public class SumOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers : ");
        System.out.println("1st number : ");
        float a = sc.nextFloat();
        System.out.println("2nd number : ");
        float b = sc.nextFloat();
        System.out.println("3rd number : ");
        float c = sc.nextFloat();
        float sum = a+b+c;
        System.out.print("The sum is "+sum);

    }
}
