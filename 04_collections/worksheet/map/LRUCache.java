package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,V> extends LinkedHashMap<K,V> {

    // TODO: private int capacity;

    public LRUCache(int capacity){
        // TODO: super(capacity,0.75f,true);
        // TODO: this.capacity=capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K,V> eldest){
        // TODO: return this.size()>capacity;
    }

    public static void main(String[] args){
        // Can use Map / LinkedHashMap / LRUCache as ref type
        // TODO: LRUCache<String,Number> fruits = new LRUCache<>(3);
        // TODO: fruits.put("apple",10);
        // TODO: fruits.put("banana",12);
        // TODO: fruits.put("pineapple",4);

        // the least recently accessed element is at the top
        // TODO: fruits.get("pineapple");
        // TODO: fruits.get("apple");
        // TODO: fruits.get("banana");
        // TODO: fruits.get("apple");
        // TODO: fruits.put("plum",100); // as pineapple is the least recently accessed will be removed

        // TODO: System.out.println(fruits);
    }

}
