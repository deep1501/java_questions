package com.java.coding_Test;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 12, 14, 17, 23, 38, 49};
        int[] arr2 = {11, 19, 27, 28, 50};

        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] mergedArray = new int[len1+len2];

        int[] mergedArrays = mergedArrays(arr1, len1, arr2, len2, mergedArray);
        for (int item: mergedArrays) {
            System.out.print(item+" ");
        }

    }

    private static int[] mergedArrays(int[] arr1, int len1, int[] arr2, int len2, int[] mergedArray) {
        int i=0;
        int j=0;
        int k=0;
        while(i<len1){
            mergedArray[k++] = arr1[i++];
        }
        while(j<len2){
            mergedArray[k++] = arr2[j++];
        }

        Arrays.sort(mergedArray);
        return mergedArray;
    }
}
