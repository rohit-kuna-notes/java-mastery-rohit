package map;
import java.util.Map;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapOps {
    public static void main(String[] args){
        // TODO: Map<String,Integer> hm1=new HashMap<>();

        /* size */
        // TODO: hm1.size();
        // TODO: hm1.isEmpty();

        // put key - value pair
        // TODO: hm1.put("Rahul",98);
        // TODO: hm1.put("Naina",80);

        /* check existence */
        // if contains key
        // TODO: hm1.containsKey("Haroon"); // TC -> O(1)

        // if contains value, is basically searching
        // TODO: hm1.containsValue(92);

        /* access value, by key */
        // TODO: hm1.get("Naina"); // TC -> O(1)

        // hm.getOrDefault(key,defaultValue) -> useful in case of calculating frequency
        // TODO: hm1.getOrDefault("Shubham",0);

        // Update or set a value for existing key, use hm.put(sameKey, newVal)
        // TODO: hm1.put("Naina", 87);

        /* key set */
        // hm.keys() -> returns Set<key's datatype>, as keys are always unique
        // TODO: Set<String> keys=hm1.keySet();

        // hm.values() -> returns Collection of values
        // TODO: Collection<Integer> vals=hm1.values();

        /* entrySet */
        // TODO: Set<Map.Entry<String,Integer>> entrySet1=hm1.entrySet();

        // if you want to iterate
        for(Map.Entry<String,Integer> entry: hm1.entrySet()){
            // methods on Map.Entry<>
            // TODO: entry.getKey(); // access key
            // TODO: entry.getValue(); // access value
            // TODO: entry.setValue(8); // update or set value
        }

        // Important
        // TODO: Map.Entry<Integer,String> entry=Map.entry(1,"P"); // For a single entry we can also use Map.entry(k,v) method

        // equality
        // TODO: Map<Integer,String> m1=new HashMap<>();
        // TODO: m1.put(1,"Arijit");
        // TODO: m1.put(2,"B");

        // TODO: Map<Integer,String> m2=new HashMap<>();
        // TODO: m2.put(1,"Arijit");
        // TODO: m2.put(2,"B");

        // TODO: boolean eq1=m1.equals(m2);
        // TODO: System.out.println(eq1);

        // Printing Map will automatically pretty print it
        // as HashMap has toString overridden
        // TODO: System.out.println(hm1);

    }
}
