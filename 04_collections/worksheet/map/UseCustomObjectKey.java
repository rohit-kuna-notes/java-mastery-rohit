package map;

import java.util.Map;
import java.util.Objects;
import java.util.HashMap;

public class UseCustomObjectKey {
    public static void main(String[] args){

        // create a map with Employee and designation
        // TODO: Map<Employee1,String> hm1=new HashMap<>();
        // TODO: hm1.put(new Employee1("Clint", 1),"Clerk");
        // TODO: hm1.put(new Employee1("Clint",1),"HR"); // intend to override or reassign the designation,
        // but a new key-val get's registered
        // TODO: System.out.println(hm1.size()); // 2

        // way 1 :
        // don't use new keyword while passing the employee object as key
        // Create the employee first, then pass it in put
        // TODO: Map<Employee1,String> hm2=new HashMap<>();
        // TODO: Employee1 empUlf=new Employee1("Ulf", 3);
        // TODO: hm2.put(empUlf,"Manager");
        // TODO: hm2.put(empUlf,"Director"); // correct way to reassign
        // TODO: System.out.println(hm2.size()); // 1-> Works

        // way 2 :
        // to be safe, and ensure if the Object details are same it should be considered as same key,
        // we must override hashCode and equals methods that is provided by Object Class
        // hashCode -> find the bucket / get the index into which bucket to put
        // equals -> check if two objects are same
        // TODO: Map<Employee2,String> hm3=new HashMap<>();
        // TODO: hm3.put(new Employee2("Yitesh",100),"Guard");
        // TODO: hm3.put(new Employee2("Yitesh",100),"Manager"); // again reassigning yitesh as Manager
        // TODO: System.out.println(hm3.size()); // 1 -> correct

    }
}

class Employee1{
    // TODO: public String name;
    // TODO: public Integer id;

    public Employee1(String name, Integer id){
        // TODO: this.name=name;
        // TODO: this.id=id;
    }
}

class Employee2{
    // TODO: private String name;
    // TODO: private Integer id;

    public Integer getId() {
        // TODO: return id;
    }

    public String getName(){
        // TODO: return this.name;
    }

    public Employee2(String name, Integer id){
        // TODO: this.name=name;
        // TODO: this.id=id;
    }

    @Override
    public int hashCode(){
        // TODO: return Objects.hash(name,id);
    }

    @Override
    public boolean equals(Object obj){
        // TODO: if(obj==null)return false;
        // TODO: if(this==obj)return true;
        // TODO: if(this.getClass()!=obj.getClass())return false;

        if(obj instanceof Employee2){
            // TODO: Employee2 other= (Employee2) obj;
            // TODO: return this.id.equals(other.getId()) && this.name.equals(other.getName());
        }

        // TODO: return false;
    }
}
