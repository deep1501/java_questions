package com.java.miscellaneous;

import java.util.*;

public class HighestNumberOfRepeatedLetterWord {
    public static void main(String[] args) {
        String word = "abcdefghij gooogle microsssssssoft";
        String[] words = word.split(" ");

        List<Integer> li = new ArrayList<>();
        for(int i=0; i< words.length; i++){
            char[] chars = words[i].toCharArray();
            int freq = countFreq(chars);
            li.add(freq);
        }
        Collections.sort(li);
        System.out.println(words[li.size()-1]);
    }

    private static int countFreq(char[] chars) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i< chars.length; i++){
            if(map.containsKey(chars[i])){
                map.put(chars[i], map.get(chars[i]));
            }else{
                map.put(chars[i], 1);
            }
        }

        int max=0;
        for (Map.Entry<Character, Integer>entrySet:map.entrySet()) {
            if(entrySet.getValue()>max){
                max=entrySet.getValue();
            }
        }
        return max;
    }
}
