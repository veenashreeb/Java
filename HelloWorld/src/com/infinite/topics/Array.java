package com.infinite.topics;

public class Array {
    public static void main(String[] args) {
//Decleration
       //1
        int[] mark = new int[5];
        //2
        int a[] ;
        a = new int[0];
        //3
        int[] b = {10,20,30,40,50,60};
       //for float and string
        float[] c={45.5f,23.42f};
        String[] H={"Veena","Chandan","Shreya","Mukul","Adithya"};
        //To find the length
        System.out.println(b.length);
        System.out.println(b[0]);

        //for loop fo array
//        for (int i = 0;i<b.length;i++){
//            System.out.println(b[i]);
//        }
//to reverse the traversal
//        for (int i =b.length-1;i>=0;i--){
//            System.out.println(b[i]);
//        }

        //for-each loop
//        for (int element :b){
//            System.out.println(element);
//        }

        int[][] hash = new int[2][3];
        hash[0][0] = 101;
        hash[0][1] = 102;
        hash[0][2] = 103;
        hash[1][0] = 201;
        hash[1][1] = 202;
        hash[1][2] = 203;


        //2D array
        for (int i = 0;i<hash.length;i++){
            for (int j = 0;j< hash[i].length;j++){
                System.out.print(hash[i][j]);
                System.out.print(" ");
            }
            System.out.println( );
        }

    }
}
