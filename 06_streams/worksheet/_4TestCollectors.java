import streams.Employee;


import java.util.List;
import java.security.KeyStore.Entry;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.Objects;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class _4TestCollectors {
    public static void main(String ...args){
        // TODO: Employee e1=new Employee("Rahul", "Mumbai");
        // TODO: Employee e2=new Employee("Anjali", "Hyderabad");
        // TODO: Employee e3=new Employee("Guru", "Delhi");
        // TODO: Employee e4=new Employee("Thakur", "Mumbai");
        // TODO: List<Employee> elist=Arrays.asList(e1,e2,e3,e4);
        // TODO: Stream<Employee> employeeStream=elist.stream();
        // List<Employee> res= employeeStream.filter(Objects::nonNull).toList();
        
        Map<String,List<Employee>> grouped=employeeStream.filter(Objects::nonNull).collect(Collectors.groupingBy(s->s.getLocation()));
        // Object grouped=employeeStream.filter(Objects::nonNull).collect(Collectors.groupingBy(s->s.getLocation()));
        // Object entrySet=grouped.entrySet();/
        // System.out.println(entrySet.getClass());
        // List<String> keys=entrySet.getKeys();
        for(Map.Entry<String,List<Employee>> p : grouped.entrySet()){
            // TODO: p.getKey();
            // TODO: p.getValue();
        }

        grouped.forEach((k,v)->{
            // TODO: System.out.println(k);
            // TODO: System.out.println(v);
        });

        // TODO: Stream<Integer> s1=Arrays.asList(1,2,3,4,5,6).stream();

        // TODO: Stream<Integer> s2=Stream.of(1,2,3,4,5,6);

        Stream<Integer> s3=Stream.iterate(0,n->n+1).limit(4);

        // 3rd largest
        // TODO: List<Integer> l1=Arrays.asList(2,6,1,18,4,9);
        // TODO: Integer res1 = l1.stream().sorted(Collections.reverseOrder()).skip(2).findFirst().orElse(null);
        // TODO: Integer res2 = l1.stream().sorted(Comparator.reverseOrder()).skip(2).findFirst().orElse(null);
        Integer res3 = l1.stream().sorted((a,b)->Integer.compare(b,a)).skip(2).findFirst().orElse(null);
        Integer res4 = l1.stream().sorted((a,b)->b.compareTo(a)).skip(2).findFirst().orElse(null);
        // TODO: System.out.println(res2);

        Stream<Integer> numbers=Stream.iterate(0, n->n+1).limit(10);
        Map<Boolean,List<Integer>> evenOddGroup=numbers.collect(Collectors.partitioningBy(n->n%2==0));
        evenOddGroup.forEach((key,value)->{
            // TODO: System.out.println(key);
            // TODO: System.out.println(value);
        });

        // Object o1 = Collectors.partitioningBy(m->m%2==0);
        // System.out.println(o1);



    }
}


