package ru.kudaiberdieva.homeworks.homework15;


import java.util.ArrayList;

public class MainApp {
    // Задание 1
    public static ArrayList<Integer> makeArrList(int min, int max) {
        ArrayList<Integer> numList = new ArrayList<>();

        for (int i = min; i <= max; i++) {
            numList.add(i);
        }
        return numList;
    }

    // Задание 2
    public static int sumListElements(ArrayList<Integer> arrayList) {
        int sum = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) > 5) {
                sum += arrayList.get(i);
            }
        }
        return sum;
    }

    // Задание 3
    public static void replaceElements(int x, ArrayList<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            list.set(i, x);
        }
    }

    // Задание 4
    public static void increaseElements(int x, ArrayList<Integer> list2) {

        for (int i = 0; i < list2.size(); i++) {
            int num = list2.get(i);
            list2.set(i, x + num);
        }
    }


    public static void main(String[] args) {

        //  Задание 1
        ArrayList<Integer> numLine = makeArrList(1, 15);
        System.out.println(numLine);
        System.out.println();
        // Задание 2
        ArrayList<Integer> numbers = new ArrayList();
        numbers.add(5);
        numbers.add(9);
        numbers.add(10);
        numbers.add(3);
        numbers.add(1);
        numbers.add(8);
        int result = sumListElements(numbers);
        System.out.println(result);
        System.out.println();
        // Задание 3
        ArrayList<Integer> list1 = makeArrList(1, 10);
        replaceElements(7, list1);
        System.out.println(list1);
        System.out.println();
        // Задание 4
        ArrayList<Integer> list3 = makeArrList(8, 14);
        increaseElements(4, list3);
        System.out.println(list3);
        System.out.println();
        // Задание 5
        ArrayList<Employee> employeesList = new ArrayList<>();
        employeesList.add(new Employee("Geralt", 44));
        employeesList.add(new Employee("Yennefer", 29));
        employeesList.add(new Employee("Triss", 31));
        employeesList.add(new Employee("Ciri", 18));
        employeesList.add(new Employee("Dandalion", 27));
        ArrayList<String> names = Employee.getEmployeeNames(employeesList);
        System.out.println(names);
        // Задание 6
        ArrayList<Employee> filteredList = Employee.filterEmployeeByAge(employeesList, 27);
        ArrayList<String> namesFiltered = Employee.getEmployeeNames(filteredList);
        System.out.println(namesFiltered);

        // Задание 7
        int minAverageAge = 26;
        boolean isAboveMinAverageAge = Employee.isAverageAgeAboveMin(employeesList, minAverageAge);
        if (isAboveMinAverageAge) {
            System.out.println("Average age is above " + minAverageAge);
        } else {
            System.out.println("Average age is not above " + minAverageAge);
        }
        // Задание 8
        Employee youngestEmployee = Employee.findYoungestEmployee(employeesList);
        System.out.println(youngestEmployee.getName() + " " + youngestEmployee.getAge());
    }
}
