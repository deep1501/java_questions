package com.java.basic_maths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Annagram {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("hello", "world", "olrwd", "hell", "dlorw");
        List<List<String>> lists = listAllAnnagrams(str);
        List<List<String>> collect = lists.stream().collect(Collectors.toList());
        System.out.println(collect);
    }

    public static List<List<String>> listAllAnnagrams(List<String> str){
        List<List<String>> result = new ArrayList<>();
        HashMap<String, List<String>> hm = new HashMap<>();

        for(String s : str) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String temp = new String(arr);

            if(hm.containsKey(temp)) {
                hm.get(temp).add(s);
            } else {
                List<String> list = new ArrayList<>();
                list.add(s);
                hm.put(temp, list);
            }
        }

        for(String s : hm.keySet()) {
            result.add(hm.get(s));
        }
        return result;
    }
}
