package com.java.array;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    private static int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int result=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                count=0;
            }else{
                count++;
                result=Math.max(result, count);
            }
        }
        return result;
    }
}
