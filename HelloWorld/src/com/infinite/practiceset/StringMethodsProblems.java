package com.infinite.practiceset;

public class StringMethodsProblems {
    public static void main(String[] args) {
        String a = "Veen  a   Shree";
        System.out.println(a.toLowerCase());
        System.out.println(a.replace(" ","_"));
        String b = "Dear sharat, thanks a lot";
        System.out.println(b.replace("sharat","Veena"));
        System.out.println(a.indexOf("  "));
        System.out.println(a.indexOf("    "));
        System.out.println("\'Dear veena, Thanks a lot'");
    }
}
