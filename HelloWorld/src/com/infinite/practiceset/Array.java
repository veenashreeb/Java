package com.infinite.practiceset;

public class Array {
    public static void main(String[] args) {
//       1 st problem
//        float[] a =  {45.63f,45.5f,53.3f,56.6f,89.0f};
//        float sum = 0;
//        for (float element:a){
//            sum+=element;
//        }
//        System.out.println(sum);


        //2nd problem
//        float[] a =  {45.63f,45.5f,53.3f,56.6f,89.0f};
//        float sum = 45.63f;
//        boolean isInArray = false;
//        for (float element:a){
//            isInArray = true;
//        }
//        if (isInArray){
//            System.out.println("present");
//        }
//        else {
//            System.out.println("Not");
//        }


        //3rd problem
//        float[] a =  {45.63f,45.5f,53.3f,56.6f,89.0f};
//        float sum = 0;
//        boolean isInArray = false;
//        for (float element:a){
//            sum+=element;
//
//        }
//        System.out.println(sum/a.length);

//        int[][] a ={{1,2,3,},{1,2,3}};
//        int[][] b = {{1,2,3},{1,2,3}};
//        int[][] r ={{0,0,0},{0,0,0}};
//Add two array
//        for(int i=0;i<a.length;i++){
//            for (int j=0;j<a[i].length;j++){    //row no of times
//                r[i][j] = a[i][j]+b[i][j];  //col no of times
//                System.out.print(r[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println();

        //reversing the array
        int[] arr ={34,65,35,76,345};
//        int l = arr.length;
//        int n = Math.floorDiv(l,2);
//        int temp=0;
//        for (int i=0;i<n;i++){
//            //swap
//                                  // arr[i]   arr[l-i-1]   temp
//                                  //  |1|     |2|         | |
//             temp=arr[i] ;        //  | |     |2|         |1|
//            arr[i] =arr[l-i-1] ;  //  |2|     | |         |1|
//            arr[l-i-1] = temp;    //  |2|    |1|         | |
//        }
//        for (int element: arr) {
//            System.out.print(element+ "  ");
//        }
        int max =0;
        boolean isSorted = true;
        int min =arr[0];
        //maximum
        for (int e:arr) {
            if (e>max){
                max = e;
            }
        }
        System.out.println(max);

        //minimum
        for (int i:arr){
            if (i<min){
                min =i;
            }
        }
        System.out.println(min);
        //sorted
        for (int i =0;i<arr.length;i++) {

            if (arr[i]>arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if (isSorted){
            System.out.println("sorted");
        }
        else {
            System.out.println("Not");
        }


    }


    }



