import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class _3CollectionsAndStringBuilderRecap {
    public static void main(String[] args){
        Map<Integer,String> hm=new HashMap<>();
        hm.put(1,"A");
        hm.put(2,"B");

        hm.values();
        hm.keySet();

        for(Map.Entry<Integer,String> entry : hm.entrySet()){
            Integer k=entry.getKey();
            String v=entry.getValue();
        }

        hm.forEach((key,val)->{
            Integer k=key;
            String v=val;
        });
        // (key,val)->{} is actually a lambda i.e. BiConsumer which had accept abstract method
        // it has void return type


        Map<Integer,Integer> hm2 = new HashMap<>();
        hm2.put(1, 100);
        hm2.put(2, 200);
        hm2.put(null, null); // allows null

        Hashtable<Integer,Integer> hashtable = new Hashtable<>();
        hashtable.put(1, 1000);
        // hashtable.put(1, null);// null not allowed
        // Exception in thread "main" java.lang.NullPointerException
        // at java.base/java.util.Hashtable.put(Hashtable.java:476)

        
    }
}
