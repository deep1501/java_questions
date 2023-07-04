package com.java.basic_maths;

public class ReverseNumber {
    public static void main(String[] args) {
        int reversedNumber = reverseNumber(1234);
        System.out.println(reversedNumber);
    }

    private static int reverseNumber(int num) {
        int reversed=0;
        while(num!=0){
            int rem=num%10;
            reversed=reversed*10+rem;
            num=num/10;
        }
        return reversed;
    }
}
