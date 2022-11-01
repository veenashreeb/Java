package com.infinite;

import java.util.Scanner;

public class StudentMarksCalculating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float total = 500;
        System.out.println("Enter the student marks: ");
        System.out.println("Sub1");
        float a1 = sc.nextFloat();
        System.out.println("Sub2");
        float a2 = sc.nextFloat();
        System.out.println("Sub3");
        float a3 = sc.nextFloat();
        System.out.println("Sub4");
        float a4 = sc.nextFloat();
        System.out.println("Sub5");
        float a5 = sc.nextFloat();
        float b = ((a1 + a2 +a3+ a4+ a5)/total)*100;
        System.out.print("Percentage out of 100 = " + b);

    }
}
