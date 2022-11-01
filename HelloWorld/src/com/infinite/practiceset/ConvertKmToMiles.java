package com.infinite.practiceset;

import java.util.Scanner;

public class ConvertKmToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float ratio = 0.621371f;
        System.out.print("Enter the value of KM : ");
        float km = sc.nextFloat();
        float miles = km * ratio;
        System.out.println(km+" KM into miles is : "+miles );
    }
}
