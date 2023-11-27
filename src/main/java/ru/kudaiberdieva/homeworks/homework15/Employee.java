package ru.kudaiberdieva.homeworks.homework15;

import java.util.ArrayList;

public class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public static ArrayList<String> getEmployeeNames(ArrayList<Employee> employees) {
        ArrayList<String> names = new ArrayList<>();
        for (Employee employee : employees) {
            names.add(employee.name);
        }
        return names;
    }

    public static ArrayList<Employee> filterEmployeeByAge(ArrayList<Employee> employees, int minAge) {
        ArrayList<Employee> filteredList = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.age >= minAge) {
                filteredList.add(employee);
            }
        }
        return filteredList;
    }

    public static boolean isAverageAgeAboveMin(ArrayList<Employee> employees, int minAverageAge) {
        if (employees.isEmpty()) {
            return false;
        }
        int totalAge = 0;
        for (Employee employee : employees) {
            totalAge += employee.age;
        }
        int averageAge = totalAge / employees.size();
        return averageAge > minAverageAge;
    }
    public static Employee findYoungestEmployee(ArrayList<Employee> employees) {
        if (employees.isEmpty()) {
            return null;
        }

        Employee youngest = employees.get(0);

        for (Employee employee : employees) {
            if (employee.age < youngest.age) {
                youngest = employee;
            }
        }

        return youngest;
    }
}


