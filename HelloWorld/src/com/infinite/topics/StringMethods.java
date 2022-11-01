package com.infinite.topics;

public class StringMethods {
    public static void main(String[] args) {
        String n = "Veena";
        System.out.println(n.length());
        System.out.println(n.toLowerCase());
        System.out.println(n.toUpperCase());
        String h = "    Veena    ";
        System.out.println(h);
        System.out.println(h.trim());
        System.out.println(n.substring(2));
        System.out.println(n.substring(2,4));
        System.out.println(n.replace('e','n'));
        System.out.println(n.startsWith("V"));
        System.out.println(n.endsWith("a"));
        System.out.println(n.charAt(2));
        System.out.println(n.indexOf("V"));
        System.out.println(n.indexOf("na",0));
        System.out.println(n.lastIndexOf("a"));
        System.out.println(n.equals("Veena"));
        System.out.println(n.equalsIgnoreCase( "Veena"));
    }
}
