package com.java.coding_Test;

import java.util.List;

public class CombinationOfPassword {
    public static void main(String[] args) {
        List<String> password = List.of("abc", "pqr", "bcd", "qrs");
        combinationOfPassword(password);
    }

    private static void combinationOfPassword(List<String> password) {
        for (String str:password) {
            for(int i=0; i<str.length(); i++){
                char ch = str.charAt(i);
                String next = String.valueOf((char)(ch + 1));
                System.out.print(next);
            }
            System.out.println();
        }
    }
}
