package list;

public class Arrays {
    public static void main(String[] args){
        // What happens if I want to store non primitives i.e. Objects in array
        // addresss ref of that Object is stored
        Student[] studArry=new Student[100];
        studArry[0]=new Student("Raj",100); // address of Student object Raj is stored heer
    }
}

class Student {
    private String name;
    private int marks;

    public Student(String name, int marks){
        this.name=name;
        this.marks=marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}
