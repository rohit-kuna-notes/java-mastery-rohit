
import java.util.Map;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.List;

public class _3HashMapTest {
    public static void main(String[] args) {
        // Create a HM
        // TODO: Map<String,Integer> hm1=new HashMap<>();
        // put
        // TODO: hm1.put("apple",3);
        // TODO: hm1.put("banana",4);
        // TODO: hm1.put("mango",2);
        // get
        // TODO: hm1.get("apple");
        
        // getOrDefault(key,defaultValue) -> returns default value when key doesn't exist (safe get)
        // TODO: hm1.getOrDefault("orange", 0); // if orange doesn't exist the count of orange will be returned as 0
        // useful in forming count hm

        // check if key exists
        // TODO: hm1.containsKey("strawberry"); // O(1)
        // TODO: hm1.containsValue(3); // O(n)

        // getting all keys or all values separately
        // TODO: Set<String> keys=hm1.keySet();
        // TODO: System.out.println(keys);
        // TODO: Collection<Integer> vals = hm1.values();
        // TODO: System.out.println(vals);

        // entry set
        // TODO: Object entryObj = hm1.entrySet();
        // TODO: System.out.println(entryObj.getClass());
        // TODO: Set<Map.Entry<String,Integer>> entryObj2 = hm1.entrySet();

        // iterate through entrySet
        for(Map.Entry<String,Integer> entry: entryObj2){
            // TODO: System.out.println(entry.getKey());
            // TODO: System.out.println(entry.getValue());
        }

        // using lambda
        // Map class has forEach default method which takes BiConsumer
        hm1.forEach((k,v)->{
            // TODO: System.out.println(k);
            // TODO: System.out.println(v);
        });

    }
}

