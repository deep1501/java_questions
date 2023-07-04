package com.java.array;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int[] square = square(nums);
        Arrays.sort(square);
        System.out.println(Arrays.toString(square));
    }

    private static int[] square(int[] nums) {
        int [] pow =new int[nums.length];
        for(int i=0; i< nums.length; i++){
            pow[i] = nums[i]*nums[i];
        }
        return pow;
    }
}
