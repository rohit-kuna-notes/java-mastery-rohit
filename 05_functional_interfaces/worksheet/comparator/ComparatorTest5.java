package comparator;

import java.util.List;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.Arrays;

public class ComparatorTest5 {
    public static void main(String[] args) {
        // TODO: List<CompStudent> students = new ArrayList<>(List.of(new CompStudent("Rakesh", 90), new CompStudent("Bablu", 100), new CompStudent("Ankita", 70)));
        // TODO: students.sort(new Comparator<CompStudent>(){
            @Override
            public int compare(CompStudent s1, CompStudent s2){
                // TODO: return Integer.compare(s1.getMarks(),s2.getMarks());
            }
        // TODO: });
        // TODO: students.sort((s1,s2)->Integer.compare(s1.getMarks(),s2.getMarks()));
        // TODO: students.sort(Comparator.comparing(CompStudent::getMarks));

        // Just like Arrays.sort, we have Comparator.sort(obj,new Comparator<T>{...});
        // ASC
        // TODO: Collections.sort(students,Comparator.comparing(CompStudent::getMarks));

        // DESC
        // TODO: Collections.sort(students,Comparator.comparing(CompStudent::getMarks,Comparator.reverseOrder()));

        // ASC
        // TODO: Collections.sort(students,Comparator.comparing(CompStudent::getName));

        // DESC
        // TODO: Collections.sort(students,Comparator.comparing(CompStudent::getName, Comparator.reverseOrder()));

        // first by name asc, then highest marks order
        // TODO: Collections.sort(students,Comparator.comparing(CompStudent::getName).thenComparing(CompStudent::getMarks, Comparator.reverseOrder()));


        // TODO: List<Integer> numbers=new ArrayList<>(Arrays.asList(1,2,3,4));
        // TODO: Collections.sort(numbers,Comparator.naturalOrder()); // ASC
        // TODO: Collections.sort(numbers,Comparator.reverseOrder()); // DESC
        // TODO: Collections.sort(numbers,Comparator.comparingInt(Integer::intValue)); // for primitives
        // TODO: Collections.sort(Arrays.asList(1L,2L,3L), Comparator.comparingLong(Long::longValue));

    }
}

class CompStudent {
    private String name;
    private int marks;

    public CompStudent(String name, int marks){
        this.name=name;
        this.marks=marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString(){
        return this.name + "-" + this.marks;
    }
}
