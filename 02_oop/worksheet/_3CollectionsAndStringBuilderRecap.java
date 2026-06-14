
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class _3CollectionsAndStringBuilderRecap {
    public static void main(String[] args){
        // TODO: Map<Integer,String> hm=new HashMap<>();
        // TODO: hm.put(1,"A");
        // TODO: hm.put(2,"B");

        // TODO: hm.values();
        // TODO: hm.keySet();

        for(Map.Entry<Integer,String> entry : hm.entrySet()){
            // TODO: Integer k=entry.getKey();
            // TODO: String v=entry.getValue();
        }

        hm.forEach((key,val)->{
            // TODO: Integer k=key;
            // TODO: String v=val;
        });
        // (key,val)->{} is actually a lambda i.e. BiConsumer which had accept abstract method
        // it has void return type


        // TODO: Map<Integer,Integer> hm2 = new HashMap<>();
        // TODO: hm2.put(1, 100);
        // TODO: hm2.put(2, 200);
        // TODO: hm2.put(null, null); // allows null

        // TODO: Hashtable<Integer,Integer> hashtable = new Hashtable<>();
        // TODO: hashtable.put(1, 1000);
        // hashtable.put(1, null);// null not allowed
        // Exception in thread "main" java.lang.NullPointerException
        // at java.base/java.util.Hashtable.put(Hashtable.java:476)

        // TODO: StringBuilder sb=new StringBuilder();
        // TODO: sb.append("Rakesh");
        // TODO: sb.append("Khanna");
        // TODO: sb.length();

        // TODO: StringBuffer s2=new StringBuffer();
        // TODO: s2.append("Hi");
        // TODO: s2.append("hello");

        // TODO: System.out.println(s2);
    }
}
