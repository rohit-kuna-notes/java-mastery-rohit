package linkedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
    public static void main(String[] args){

        // LinkedList<String> ll1=new LinkedList<>(Arrays.asList("a","b","c","d")); // will only give List methods not LinkedList as ref is List

        // TODO: LinkedList<String> ll1=new LinkedList<>(Arrays.asList("a","b","c","d"));
        /* Size */
        // size
        // TODO: ll1.size(); // O(1) -> size is stored as property

        // check if empty
        // TODO: ll1.isEmpty();

        /* ADDITION */

        // add
        // TODO: ll1.add("g"); // adds at last // O(1) as doubly linked list we have tail pointer

        // TODO: List<String> extras=new ArrayList<>(Arrays.asList("k","y","c"));
        // adding multiple elements
        // TODO: ll1.addAll(extras); // O(extras.size())

        // add at the start O(1)
        // TODO: ll1.addFirst("p"); // O(1)

        // add at last
        // TODO: ll1.addLast("z"); // O(1) as it's a doubly linkedList we have tail too

        /* Set */
        // TODO: ll1.set(2,"x"); // O(N) -> as we need to traverse the indexes from start

        /* Remove a node */
        // TODO: ll1.remove(); // removes last by default // O(N) -> need to traverse

        // remove by index
        // TODO: ll1.remove(3); //  o(N) -> need to traverse

        // remove by Reference
        // TODO: ll1.remove("g"); // does find and remove // O(n) -> need to traverse

        // bulk remove
        // TODO: ll1.removeAll(extras);

        // remove first and last i.e. head and tail
        // TODO: ll1.removeFirst();
        // TODO: ll1.removeLast();

        // traverses and removes the first occurrence
        // TODO: ll1.removeFirstOccurrence("p");
        // TODO: ll1.removeLastOccurrence("k");

        // conditional removing
        // TODO: ll1.removeIf(s->s.equals("x"));

        // clear all elements
        // TODO: ll1.clear();

        /* Existence */
        // TODO: ll1.contains("p");

        /* Accessing element by index, index of */

        // Get by index
        // TODO: ll1.get(3); // o(N) -> need to search

        // get first and last
        // TODO: ll1.getFirst();
        // TODO: ll1.getLast();

        // get index of an element
        // TODO: ll1.indexOf("g");

        /* Equality */
        // TODO: LinkedList<String> ll2=new LinkedList<>(ll1);
        // TODO: boolean eq1=ll1.equals(ll2);

        /* Sorting */
        // TODO: ll1.sort(null);

        /* Clone */ // returns an Object
        // TODO: Object ll3 = ll1.clone();

        /* Just prints the elemensts inside */
        // TODO: System.out.println(ll3.toString());

        /* get head */
        // TODO: String head=ll1.getFirst();
        // TODO: String tail=ll1.getLast();

        /* Traversing */
        // Using Iterator
        // TODO: Iterator<String> it=ll1.iterator();
        while(it.hasNext()){
            // String value=it.next();
            // System.out.println(value);
            // TODO: System.out.println(it.next());
        }

    }
}
