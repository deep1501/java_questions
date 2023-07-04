package com.java.basic_recurssion;

public class Fibonacci {
    public static void main(String[] args) {
        int n=5;
        fibonacci(n);
    }

//    private static void fibonacci(int n) {
//        if(n==0 ){
//            System.out.println(n);
//        }else{
//            int [] fib = new int[n+1];
//            fib[0] =0;
//            fib[1]=1;
//            for(int i=2; i<n; i++){
//                fib[i]=fib[i-1]+fib[i-2];
//            }
//            for (int i=0; i<n; i++){
//                System.out.print(fib[i]+" ");
//            }
//        }
//    }

    private static void fibonacci(int n) {
        int first =0;
        int last =1;
        System.out.print(first+" "+ last+" ");
        for(int i=2; i<n; i++){
            int result = first+last;
            first=last;
            last=result;
            System.out.print(result+" ");
        }
    }
}
