package com.java.coding_Test;

public class MinimumDeletionForPalindrome {
    public static void main(String[] args) {
        String str = "aebcbda";
        int result = minDeletionRequired(str);
        System.out.println("Result is : "+result);
    }
    private static int minDeletionRequired(String str) {
        StringBuilder sb = new StringBuilder(str);
        String st = sb.reverse().toString();

        int len = str.length();
        int[][] arr = new int[len+1][len+1];

        for(int i=1; i<=len; i++){
            for (int j=1; j<=len; j++){
                if(str.charAt(i-1) == st.charAt(j-1)){
                    arr[i][j]=arr[i-1][j-1] + 1;
                }else {
                    arr[i][j]=Math.max(arr[i-1][j], arr[i][j-1]);
                }
            }
        }
        return len-arr[len][len];
    }
}
