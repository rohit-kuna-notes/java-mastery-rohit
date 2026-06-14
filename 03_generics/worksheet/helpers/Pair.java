package helpers;

import java.util.LinkedList;
import java.util.Queue;

public class Pair<K, V> {
    public K first;
    public V second;

    public Pair(K first, V second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString(){
        return this.first + ":" + this.second;
    }

}

class PairTest{
    public static void main(String[] args){
        // TODO: Queue<Pair<Integer, Integer>> q = new LinkedList<>();
        // TODO: q.add(new Pair<>(1, 10));
        // TODO: q.add(new Pair<>(2, 20));
        // TODO: System.out.println(q);
    }
}
