package com.infinite.practiceset;
import java.util.Arrays;
public class Test {
    static void ArraysFunction() {
        int[] numArr = {6, 8, 9, 10, 40, 66};
        int resultIndex = Arrays.binarySearch(numArr, 50);
        System.out.println("resultIndex = " + resultIndex);
        int[] numArr1 = {6, 8, 9, 10, 40, 66};
        int[] numArr2 = {6, 8, 9, 10, 40, 66};
        boolean resultCompare = Arrays.equals(numArr1, numArr2);
        System.out.println(resultCompare); //prints true or false
        int[] numArr3 = {20, 5, 30, 50, 10, 8};
        Arrays.sort(numArr3);
        for (int a : numArr3) {
            System.out.print(a + " ");
        }
    }
}
