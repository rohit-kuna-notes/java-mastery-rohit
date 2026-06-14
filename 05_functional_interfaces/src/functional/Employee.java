package functional;

public class Employee implements Comparable<Employee> {
    private String name;
    private String role;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    @Override
    public int compareTo(Employee other) {
        return (this.name).compareTo(other.name); // use this when comparing two strings
    }

    @Override
    public String toString() {
        return this.name + "-" + this.role;
    }
}
