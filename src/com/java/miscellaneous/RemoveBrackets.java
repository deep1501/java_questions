package com.java.miscellaneous;

public class RemoveBrackets {
    public static void main(String[] args) {
        String str = "a+((b-c)+d)";
        removeChar(str);
    }

    private static void removeChar(String str) {
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)!='(' && str.charAt(i)!=')'){
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
