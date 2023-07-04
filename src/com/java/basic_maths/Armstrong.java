package com.java.basic_maths;

public class Armstrong {

    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }

    private static boolean isArmstrong(int num) {
        int sum=0;
        int temp=num;
        while(num!=0) {
            int rem = num % 10;
            sum = sum + rem * rem * rem;
            num = num / 10;
        }if(sum==temp){
            return true;
        }
        return false;
    }
}
