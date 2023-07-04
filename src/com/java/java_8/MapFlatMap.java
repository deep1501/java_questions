package com.java.java_8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MapFlatMap {

    public static void main(String[] args) {
        List<Institute> instituteList = new ArrayList<>();

        instituteList.add(new Institute("IIM", Arrays.asList("Bangalore", "Ahmedabad", "Kozhikode", "Lucknow")));
        instituteList.add(new Institute("IIT", Arrays.asList("Delhi", "Mumbai", "Kharagpur")));
        instituteList.add(new Institute("NIFT", Arrays.asList("Hyderabad", "Mumbai", "Patna", "Bangalore")));

        instituteName(instituteList);
        uniqueLocations(instituteList);
    }

    public static void instituteName(List<Institute> institutes){
        List<String> collect = institutes.stream().map(institute -> institute.getName()).collect(Collectors.toList());
        System.out.println(collect);
    }

    public static void uniqueLocations(List<Institute> institutes){
        Set<String> collect = institutes.stream().flatMap(institute -> institute.getLocations().stream()).collect(Collectors.toSet());
        System.out.println(collect);
    }
}
