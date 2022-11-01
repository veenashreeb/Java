package com.infinite.practiceset;

import java.util.Scanner;

public class CalculatingCgpa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("To Calculate cgpa enter 3 sub numbers : ");
        System.out.print("Enter 1st subject: " );
        float a = sc.nextFloat();
        System.out.print("enter 2n sub");
        float b = sc.nextFloat();
        System.out.print("enter 3rd sum");
        float c = sc.nextFloat();
        float cgpa = ((a+b+c)/30);
        System.out.print("The cgpa is : " +cgpa);
    }
}
