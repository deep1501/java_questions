package com.java.basic_maths;
//Given a number N. Count the number of digits in N which evenly divides N.
public class DigitCount {
    public static void main(String[] args) {
        int result = countDigit(421);
        System.out.println("Result is: "+result);
    }

    private static int countDigit(int N) {
        int count=0;
        int temp=N;
        while(N!=0){
            int rem = N%10;
            if(rem!=0 && temp%rem==0){
                count++;
            }
            N=N/10;
        }
        return count;
    }
}
