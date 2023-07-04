package com.java.basic_hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BasicHashing {
    public static void main(String[] args) {
        Map<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("Nepal", 80);
        hm.put("USA", 60);
        System.out.println(hm);
        System.out.println(hm.get("China"));
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.remove("Nepal"));
        System.out.println(hm.size());
        System.out.println(hm.isEmpty());

//        Set<Map.Entry<String, Integer>> entrySet = hm.entrySet();
//        for (Map.Entry<String, Integer> entry:entrySet) {
//            System.out.println(entry.getKey()+": "+ entry.getValue());
//        }

        Set<String> keys = hm.keySet();
        for (String key:keys) {
            System.out.println(key +": "+ hm.get(key));
        }
    }
}
