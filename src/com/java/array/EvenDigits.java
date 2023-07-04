package com.java.array;

public class EvenDigits {

    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        int digit = countDigits(nums);
        System.out.println(digit);
    }

    private static int countDigits(int[] nums) {
        int count =0;
        int sum=0;
        for(int i=0; i<nums.length; i++){
            while(nums[i]!=0){
                nums[i]=nums[i]/10;
                ++count;
            }
            if(count%2==0){
                sum =sum+1;
            }
        }
        return sum;
    }

}
