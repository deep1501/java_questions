package com.java.miscellaneous;

public class MaximumRepeatingSubstring {
    public static void main(String[] args) {
        String text = "onetwooneoneoneone";
        String pattern = "one";
        System.out.println(maxRepeating(text, pattern));
    }

    private static int maxRepeating(String text, String pattern) {

        if(pattern.length()>text.length()){
            return -1;
        }
        StringBuilder sb = new StringBuilder("");
        int ans=0;
        while(sb.length()<=text.length()){
            sb.append(pattern);
            if(text.contains(sb)){
                ans++;
            }else{
                break;
            }
        }
        System.out.println(sb);
        return ans;
    }
}
