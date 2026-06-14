
public class _1InheritancePolymorphism {
    public static void main(String[] args) {
        // TODO: Animal dog1 = new Dog("A", 12);
        // TODO: dog1.eat();
        // dog1.barkStyle(); // no possible as methods from ref typw will be available though instance is of Dog

        // TODO: Dog dog2 = new Dog("B", 14);
        // TODO: dog2.barkStyle();
        // TODO: dog2.eat();
    }
}

class Animal{
    public String name;
    public int age;

    public Animal(String name, int age) {
        this.name=name;
        this.age=age;
    }

    public void eat() {
        System.out.println("Animal Eats");
    }
}

class Dog extends Animal{
    public Dog(String name, int age){ // have to define custom constructor( name, age )
        super(name, age);
    }
    
    public void barkStyle(){
        System.out.println("Bark");
    }

    @Override
    public void eat(){
        System.out.println("Dog Eats");
    }
}