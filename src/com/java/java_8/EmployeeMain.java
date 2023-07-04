package com.java.java_8;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

        numberOfMaleAndFemale(employeeList);
        nameOfAllTheDepartments(employeeList);
        averageAgeOfMaleAndFemale(employeeList);
        highestPaidEmployee(employeeList);
        employeeJoinedAfter(employeeList);
        numberOfEmployeeInEachDepartment(employeeList);
        avgSalOfEachDepartment(employeeList);
        youngestEmployeeInProductDevelopmentDepartment(employeeList);
        mostWorkingExperience(employeeList);
        maleAndFemaleEmpInSalesAndMarketing(employeeList);
        avgSalaryOfMaleAndFemaleEmployee(employeeList);
        namesOfAllEmployeeInEachDepartment(employeeList);
    }

    //    How many male and female employees are there in the organization?
    private static void numberOfMaleAndFemale(List<Employee> employees){
        Map<String, Long> collect = employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(collect);
    }

//    Print the name of all departments in the organization?

    private static void nameOfAllTheDepartments(List<Employee> employees){
        employees.stream().map(employee->employee.getDepartment()).distinct().forEach(System.out::println);
    }

    //    What is the average age of male and female employees?
    private static void averageAgeOfMaleAndFemale(List<Employee> employees){
        Map<String, Double> collect = employees.stream().collect(Collectors.groupingBy(employee -> employee.getGender(), Collectors.averagingInt(employee -> employee.getAge())));
        System.out.println(collect);
    }

    //    Get the details of highest paid employee in the organization?
    private static void highestPaidEmployee(List<Employee> employees){
        Employee employee1 = employees.stream().collect(Collectors.maxBy(Comparator.comparingDouble(employee -> employee.getSalary()))).get();
        System.out.println(employee1);

    }

    //Get the names of all employees who have joined after 2015?
    private static void employeeJoinedAfter(List<Employee> employees){
        List<String> collect = employees.stream().filter(employee -> employee.getYearOfJoining() > 2015).map(employee -> employee.getName()).collect(Collectors.toList());
        System.out.println(collect);
    }
    //Count the number of employees in each department?
    private static void numberOfEmployeeInEachDepartment(List<Employee> employees){
        Map<String, Long> collect = employees.stream().collect(Collectors.groupingBy(employee -> employee.getDepartment(), Collectors.counting()));
        //System.out.println(collect);
        Set<Map.Entry<String, Long>> entrySet = collect.entrySet();
        for (Map.Entry<String, Long> entry: entrySet) {
            System.out.println(entry.getKey()+": "+ entry.getValue());
        }
    }

//    What is the average salary of each department?

    private static void avgSalOfEachDepartment(List<Employee> employees){
        Map<String, Double> collect = employees.stream()
                .collect(Collectors.groupingBy(employee -> employee.getDepartment(), Collectors.averagingDouble(employee -> employee.getSalary())));

        Set<Map.Entry<String, Double>> entrySet = collect.entrySet();
        for (Map.Entry<String, Double> entry: entrySet) {
            System.out.println(entry.getKey()+": "+ entry.getValue());
        }
    }

    //    Get the details of youngest male employee in the product development department?
    private static void youngestEmployeeInProductDevelopmentDepartment(List<Employee> employees){
        Employee emp = employees.stream().filter(employee -> employee.getGender() == "Male" && employee.getDepartment() == "Product Development").
                min(Comparator.comparingDouble(employee -> employee.getAge())).get();
        System.out.println(emp);
    }

//    Who has the most working experience in the organization?

    private static void mostWorkingExperience(List<Employee> employees){
        Employee emp = employees.stream().sorted(Comparator.comparingInt(employee -> employee.getYearOfJoining())).findFirst().get();
        System.out.println(emp);
    }
    //  How many male and female employees are there in the sales and marketing team?
    private static void maleAndFemaleEmpInSalesAndMarketing(List<Employee> employees){
        Map<String, Long> collect = employees.stream().filter(employee -> employee.getDepartment() == "Sales And Marketing").collect(Collectors.groupingBy(employee -> employee.getGender(), Collectors.counting()));

        Set<Map.Entry<String, Long>> entrySet = collect.entrySet();
        for (Map.Entry<String, Long> entry:entrySet) {
            System.out.println(entry.getKey()+": "+ entry.getValue());
        }

    }
    //       What is the average salary of male and female employees?
    private static void avgSalaryOfMaleAndFemaleEmployee(List<Employee> employees){
        Map<String, Double> collect = employees.stream().collect(Collectors.groupingBy(employee -> employee.getGender(), Collectors.averagingDouble(employee -> employee.getSalary())));
        System.out.println(collect);
    }

    //    List down the names of all employees in each department?
    private static void namesOfAllEmployeeInEachDepartment(List<Employee> employees){
        Map<String, List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(employee -> employee.getDepartment()));
        Set<Map.Entry<String, List<Employee>>> entrySet = collect.entrySet();
        for (Map.Entry<String, List<Employee>> entry: entrySet) {
            List<Employee> value = entry.getValue();
            for (Employee emp:value) {
                System.out.println(emp.getName());
            }
        }
    }
}
