package com.infinite.topics;

public class EncryptionAndDecryption {
    public static void main(String[] args) {
        //Encryption
        char g ='B';
        g = (char)(g+8);
        System.out.println(g);

        //Decryption
        g = (char)(g-8);
        System.out.println(g);
    }
}
