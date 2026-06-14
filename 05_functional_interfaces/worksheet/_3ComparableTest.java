import functional.Employee;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class _3ComparableTest {

    public static void main(String... args) {
        // compareTo()
        // Natural ordering -> Integer, String, LocalDate implement Comparable
        // when using natural ordering and don't want to pass a comparator inside sort()
        // when class is in your control and you can modify the class to implement
        // Comparable.

        Student[] studentArray = {
                // TODO: new Student("Ravi", 85),
                // TODO: new Student("Neha", 92),
                // TODO: new Student("Amit", 78)
        };

        // TODO: Arrays.sort(studentArray); // Uses compareTo() as defined in class

        // for (Student s : studentArray) {
        //     System.out.println(studentArray);
        // }

        // ------------------------------------

        // TODO: List<Student> studentList = Arrays.asList(new Student("Rahul", 100), new Student("Tony", 88),
                // TODO: new Student("Bruce", 90));
        // TODO: Collections.sort(studentList); // sorts the list doesn't return anything

        // TODO: System.out.println(studentList);

        // sort employees
        // TODO: List<Employee> employeeList = List.of(new Employee("Rahul", "HR"),new Employee("Ankita", "Marketing"), new Employee("Helios","BA")).stream().sorted().toList();
        // in sorted not passing comparator, so natural sorting i.e. defined  for class is used
        // TODO: System.out.println(employeeList);

        // ---------------------------------------------

        // TODO: TreeSet<Employee> employeesTreeSet = new TreeSet<>();
        // TODO: employeesTreeSet.add(new Employee("Kiran", "HR"));
        // TODO: employeesTreeSet.add(new Employee("Xavier", "Marketing"));
        // TODO: employeesTreeSet.add(new Employee("Bravo", "IT"));
        // As we are using Treeset bydefault it's in sorted order, so compareTo of class is being used internally
        // TODO: System.out.println(employeesTreeSet);


    }

}

