package com.java.practice;

import java.util.HashMap;
import java.util.Map;

public class SumOfTwo {
    public static void main(String[] args) {
        int[] arr = {1,4,6,2,-1,0,9};
        int sum=0;
        int[] result = sumOfTwo(arr, sum);
        for (int item:result) {
            System.out.print(item +" ");
        }
    }

    private static int[] sumOfTwo(int[] arr, int sum) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        int index=0;
        for(int n:arr){
            if(map.containsKey(sum-n)){
                result[0]= map.get(sum-n);
                result[1]=index;
                return result;
            }else{
                map.put(n,index);
                index++;
            }
        }
        return result;
    }
}
