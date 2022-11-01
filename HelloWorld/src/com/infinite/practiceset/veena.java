package com.infinite.practiceset;

import java.util.Scanner;

public class veena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the website : ");
        String a = sc.next();
        if (a.endsWith(".com")){
            System.out.println("commercial");
        } else if (a.endsWith(".org")) {
            System.out.println("organization");
            
        } else if (a.endsWith(".in")) {
            System.out.println("Indian");
        }
//        if (a%4 ==0){
//            System.out.println("leap");
//        }
//        else {
//            System.out.println("not");
//        }
//
//        switch (a){
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("saturday");
//                break;
//            default:
//                System.out.println("Sunday");
//        }
    }
}
