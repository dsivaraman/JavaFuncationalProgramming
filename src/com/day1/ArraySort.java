package com.day1;

import java.util.Arrays;

public class ArraySort {

    public static void main(String[] args) {
        int[] arr = new int[] {2,5,1,6};

        int len = arr.length;

        for (int i = 0; i< len; i++) {
            for(int j=i+1; j<len; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(" Array = " + Arrays.toString(arr));

    }
}
