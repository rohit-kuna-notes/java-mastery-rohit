package _05_functional_interfaces.files.comparator_comparable.helpers;


public class ComparatorStudent {
    private String name;
    private Integer marks;

    public ComparatorStudent(String name, Integer marks) {
        this.name = name;
        this.marks = marks;
    }

    public Integer getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name + "-" + this.marks;
    }

}
