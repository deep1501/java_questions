package com.java.basic_maths;

public class Prime {
    public static void main(String[] args) {
        System.out.println(isPrime(15));
    }

    private static boolean isPrime(int num) {
        int count=0;
        if(num==0 || num==1){
            return false;
        }
        for(int i=2; i<=num; i++){
         if(num%i==0){
             count++;
         }
        }if(count>1){
            return false;
        }
        return true;
    }
}
