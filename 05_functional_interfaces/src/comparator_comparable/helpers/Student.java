package comparator_comparable.helpers;


public class Student implements Comparable<Student> {
    private String name;
    private Integer marks;

    public Student(String name, Integer marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return this.name + "-" + this.marks;
    }

    // Suppose we want to have natural ordering in class as sort by ascending order
    // of marks
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.marks, other.marks); // use this when comparing two integers
        // could have done this
        // return this.marks-other.marks; // vulnerable to overflow
    }

}
