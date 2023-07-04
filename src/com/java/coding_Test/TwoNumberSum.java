package com.java.coding_Test;

import java.util.HashMap;
import java.util.Map;

public class TwoNumberSum {
    public static void main(String[] args) {
        int n = 14;
        int[] arr ={1,2,3,4,5,9};

        int[] nums = sumOfTwo(arr, n);
        for (int i=0; i< nums.length; i++){
            System.out.print(nums[i]+" ");
        }
    }

    private static int[] sumOfTwo(int[] arr, int n) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] requiredNumbers = null;
        int index = 0;
        for (int number : arr) {
            if (map.containsKey(n - number)) {
                requiredNumbers = new int[2];
                requiredNumbers[0] = map.get(n - number);
                requiredNumbers[1] = index;
                return requiredNumbers;
            } else {
                map.put(number, index);
                index++;
            }
        }
        return requiredNumbers;

//        int[] result = new int[2];
//        for (int i=0; i< arr.length; i++) {
//            for (int j=i+1; j< arr.length; j++) {
//                if (arr[i]+arr[j] == n) {
//                    result[0] = arr[i];
//                    result[1] = arr[j];
//                    return result; // containing 2 number
//                }
//            }
//        }
//        return arr;
    }
}
