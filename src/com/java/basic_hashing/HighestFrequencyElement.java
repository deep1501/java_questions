package com.java.basic_hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HighestFrequencyElement {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,3,3,4};
        int n = arr.length;
        freq(arr, n);
    }

    private  static void freq(int[] arr, int n){
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n ; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }



        Set<Integer> keys = map.keySet();
        int max_count=0;
        for (Integer key: keys) {
            if(max_count<map.get(key)){
                max_count=key;
            }
        }
        System.out.println(max_count + "->"+ map.get(max_count));
    }
}
