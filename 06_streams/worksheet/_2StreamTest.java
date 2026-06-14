import streams.Employee;


import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Map;
import java.util.Set;

public class _2StreamTest {
    public static void main(String[] args) {
        // how to create lists
        // TODO: String[] strs={"ab","bc","cd"}; // arrays
        // TODO: List<Integer> nums1 = Arrays.asList(1,2,3); // Fixed List from Arrays
        // TODO: List<Integer> nums2 = List.of(1,2,3); // immutable list from List
        // TODO: List<Integer> nums3 = new ArrayList<>(); // mutable ArrayList
        // TODO: nums3.add(1);
        // TODO: nums3.add(2);
        // OR
        // TODO: nums3.addAll(Arrays.asList(3,4,5));
        // OR
        // TODO: List<Integer> nums4 = new ArrayList<>(Arrays.asList(1,2,3)); // mutable ArrayList by passing List

        // creating streams
        // TODO: Stream<String> str0 = Arrays.stream(strs);
        // TODO: Stream<String> str1=Arrays.asList("apple","banana","mango").stream();
        // TODO: Stream<String> str2=Stream.of("apple","chickoo","cherry");
        Stream<Integer> infiniteStream=Stream.iterate(100,x->x+10).limit(9);
        // TODO: System.out.println(infiniteStream.toList());
        
        // terminal ops that take predicate and return boolean
        boolean anyMatchTest=Arrays.asList("Anil","Cilian","Zakhir","Anthony").stream().anyMatch(s->s.equals("Zakhir"));
        boolean allMatchTest=List.of("A","A","A").stream().allMatch(s->s.equals("A"));
        boolean noneMatch=List.of("Anil","Cilian","Zakhir","Anthony").stream().noneMatch(s->s.equals("Vinay"));
        
        // terminal ops min max which takes comparator, return an Optional as the stream might be empty
        int minVal=Arrays.asList(19,6,45,32,8,7,10).stream().min((a,b)->a-b).get();
        // TODO: int maxVal=Arrays.asList(19,6,45,32,8,7,10).stream().max(Comparator.naturalOrder()).get();

        // terminal ops count
        long count=Arrays.asList(12,18,4,16,6).stream().filter(x->x%2==0).distinct().count();

        // reduce(BinaryOperator) -> returns Optional
        int sumOfNums1 = List.of(12,6,3,9,56).stream().reduce((a,b)->a+b).get();
        // reduce(seed,BinaryOperator) -> returns value
        int sumOfNums2 = List.of(12,6,3,9,56).stream().reduce(0,(a,b)->a+b);
        // using with Strings
        String sentence1 = List.of("Hello","World").stream().reduce((s1,s2)->String.join("-",List.of(s1,s2))).get();
        // can also use Collectors.joining() for joining strings
        // TODO: String sentence2 = List.of("Hi","John").stream().collect(Collectors.joining("-"));
        // TODO: System.out.println(sentence1);

        // intermediate ops returns Stream type
        // filter(Predicate) -> returns stream
        List<Integer> evenList = List.of(12,6,3,9,56).stream().filter(n->n%2==0).collect(Collectors.toList());

        // map(Function) -> returns stream
        List<Integer> mapList = Stream.of(2,4,9,3,5).map(n->n*3).collect(Collectors.toList());
        
        // peek(Consumer) -> we can use to see what's the intermediate form by using print
        // List<Integer> num2List = Stream.of(2,6,1,8,4,5).map(n->n*2).peek(System.out::println).toList();

        // skip, limit, distinct
        List<Integer> num3List = Stream.of(2,6,1,8,4,5,4,2).distinct().map(n->n*n).peek(System.out::println).filter(n->n%2==0).skip(2).limit(3).toList();
        // TODO: System.out.println(num3List);

        // groupingBy(Function<? super Employee, ? extends String> classifier) -- criteria condition i.e. property of object
        // TODO: Map<String, List<Employee>> groupedByLocationHm = List.of(
            // TODO: new Employee("Rakesh", "mumbai"),
            // TODO: new Employee("Manish", "bangalore"),
            // TODO: new Employee("Priya", "mumbai"))
            // TODO: .stream().collect(Collectors.groupingBy(Employee::getLocation));
        groupedByLocationHm.forEach((k,v)->{
            // TODO: System.out.println(k+": "+v);
        });


        // partitioningBy(Predicate) -> returns Map<boolean,list> i.e. true -> list and false -> list
        Map<Boolean,List<Integer>> evenOddHm = Stream.of(1,4,7,9,6,8,3,2).collect(Collectors.partitioningBy(n->n%2==0));
        evenOddHm.forEach((k,v)->{
            // TODO: System.out.println(k+": "+v);
        });

        // sorting
        // TODO: Set<Employee> sortedEmp = Stream.of(
            // TODO: new Employee("Rakesh", "mumbai"),
            // TODO: new Employee("Manish", "bangalore"),
            // TODO: new Employee("Priya", "mumbai")
        // TODO: ).sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getLocation)).collect(Collectors.toSet());

        // TODO: Set<Employee> sortedEmp2 = Stream.of(
            // TODO: new Employee("Rakesh", "mumbai"),
            // TODO: new Employee("Manish", "bangalore"),
            // TODO: new Employee("Priya", "mumbai")
        // TODO: ).sorted(Comparator.comparing(Employee::getName).reversed()).collect(Collectors.toSet());

    }
}



