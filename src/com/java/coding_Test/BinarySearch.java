package com.java.coding_Test;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
//        int[] arr = { 2, 3, 4, 10, 40 };
        int[]arr ={12,15,90,34,65,78,100};
        Arrays.sort(arr);
        int x = 78;
        int index = binarySearch(arr, x);
        System.out.println(index);
    }

    private static int binarySearch(int[] arr, int x) {
        int first =0;
        int last= arr.length-1;
        while(first<=last){
            int mid = first + (last-first)/2;
            if(arr[mid]==x){
                return mid;
            }
            if(arr[mid]<x){
                first=mid+1;
            }else {
                last = mid - 1;
            }    
        }
        return -1;
    }
}
