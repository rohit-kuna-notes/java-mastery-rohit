package _05_functional_interfaces.files.comparator_comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import _05_functional_interfaces.files.comparator_comparable.helpers.Employee;
import _05_functional_interfaces.files.comparator_comparable.helpers.Student;

public class _3ComparableTest {

    public static void main(String... args) {
        // compareTo()
        // Natural ordering -> Integer, String, LocalDate implement Comparable
        // when using natural ordering and don't want to pass a comparator inside sort()
        // when class is in your control and you can modify the class to implement
        // Comparable.

        Student[] studentArray = {
                new Student("Ravi", 85),
                new Student("Neha", 92),
                new Student("Amit", 78)
        };

        Arrays.sort(studentArray); // Uses compareTo() as defined in class

        // for (Student s : studentArray) {
        //     System.out.println(studentArray);
        // }

        // ------------------------------------

        List<Student> studentList = Arrays.asList(new Student("Rahul", 100), new Student("Tony", 88),
                new Student("Bruce", 90));
        Collections.sort(studentList); // sorts the list doesn't return anything

        System.out.println(studentList);

        // sort employees
        List<Employee> employeeList = List.of(new Employee("Rahul", "HR"),new Employee("Ankita", "Marketing"), new Employee("Helios","BA")).stream().sorted().toList();
        // in sorted not passing comparator, so natural sorting i.e. defined  for class is used
        System.out.println(employeeList);

        // ---------------------------------------------

        TreeSet<Employee> employeesTreeSet = new TreeSet<>();
        employeesTreeSet.add(new Employee("Kiran", "HR"));
        employeesTreeSet.add(new Employee("Xavier", "Marketing"));
        employeesTreeSet.add(new Employee("Bravo", "IT"));
        // As we are using Treeset bydefault it's in sorted order, so compareTo of class is being used internally
        System.out.println(employeesTreeSet);


    }

}

