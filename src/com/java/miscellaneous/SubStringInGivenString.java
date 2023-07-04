package com.java.miscellaneous;

public class SubStringInGivenString {
    public static void main(String[] args) {
        String text = "takeuforwardtoforward";
        String pattern = "forward";

        int index = findPattern(text, pattern);
        System.out.println(index);
    }

    private static int findPattern(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        for (int i = 0; i < n; i++) {
            int temp = i;
            int j = 0;
            for (j = 0; j < m; j++) {
                if (text.charAt(temp) != pattern.charAt(j)) {
                    break;
                }
                temp++;
            }
            if (j == m) {
                return i;
            }
        }
        return -1;
    }

//    private static void findPattern(String text, String pattern) {
//        int foundIndex = text.indexOf(pattern);
//        System.out.println(foundIndex);
//    }
}
