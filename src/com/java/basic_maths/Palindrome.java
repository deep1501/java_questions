package com.java.basic_maths;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(isPalindrome(num));
        scan.close();
    }

    private static boolean isPalindrome(int num) {
        int temp=num;
        int sum=0;
        while(num!=0){
            int rem = num%10;
            sum=sum*10+rem;
            num=num/10;
        }if(sum==temp){
            return true;
        }
        return false;
    }
}
