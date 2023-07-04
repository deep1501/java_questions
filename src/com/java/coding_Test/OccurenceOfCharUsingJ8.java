package com.java.coding_Test;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurenceOfCharUsingJ8 {
    public static void main(String[] args) {
        String str = "deepak";
        Map<String, Long> count = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(count);
    }
}
