package com.java.practice;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[]arr ={12,15,90,34,65,78,100};
        Arrays.sort(arr);
        int reqNum=12;
        int index = search(arr,reqNum);
        System.out.println(index);
    }

    private static int search(int[] arr, int x) {
        int left =0;
        int right= arr.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(arr[mid]==x){
                return mid;
            }
            if(arr[mid]<x){
                left=left+1;
            }else {
                right = right - 1;
            }
        }
        return -1;
    }
}
