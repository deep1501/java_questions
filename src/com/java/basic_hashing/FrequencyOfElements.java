package com.java.basic_hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FrequencyOfElements {
    public static void main(String[] args) {
        int [] arr = {10, 5, 10 , 15, 10, 5};
        int n = arr.length;
        countFreq(arr, n);
    }

    private static void countFreq(int[] arr, int n) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }
        Set<Integer> keySet = map.keySet();
        for (Integer key:keySet) {
            System.out.println(key +": "+ map.get(key));
        }
    }
}
