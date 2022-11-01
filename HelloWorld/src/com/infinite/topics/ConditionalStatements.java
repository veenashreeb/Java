package com.infinite.topics;

import java.util.Scanner;

class ConditionalStatements {
}
class IfElseCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 10){
            System.out.println("You can go to school by cycle but not by bike");
        }
        else if (age <= 18){
            System.out.println("You can't drive the bike but you can travel by bus");
        }
        else {
            System.out.println("You can drive the bike");
        }
    }
}
class SwitchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
   switch (a){
       case 18:
           System.out.println("You r a teenager");
           break;
       case 20:
           System.out.println("you r a adult ");
           break;
       case 40:
           System.out.println("u r a old age");
           break;
       default:
           System.out.println("u r oldest one");
   }


    }
}
