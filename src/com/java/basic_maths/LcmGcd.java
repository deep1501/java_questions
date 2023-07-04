package com.java.basic_maths;

import java.util.Arrays;

public class LcmGcd {
    public static void main(String[] args) {
        Long[] result = lcmAndGcd(50L, 15L);
        System.out.println(Arrays.stream(result).toList());
    }

    private static Long[] lcmAndGcd(long l1, long l2) {
        Long[] result = new Long[2];
        Long gcd = gcd(l1, l2);
        Long lcm = l1*l2/gcd;
        result[0] = gcd;
        result[1] = lcm;
        return result;
    }

    private static Long gcd(long l1, long l2) {
        if(l2==0){
            return l1;
        }
        while(l1%l2!=0){
            long rem = l1%l2;
            l1=l2;
            l2=rem;
        }
        return l2;
    }
}
