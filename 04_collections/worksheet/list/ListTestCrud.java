package list;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;

public class ListTestCrud {
    public static void main(String[] args) {
        // TODO: List<String> l1=new ArrayList<>(Arrays.asList("a","b","c","d"));

        // size
        // TODO: int k=l1.size();
        
        // add into list
        // TC: O(1), Worst case : O(n) in case of resizing occurs
        // TODO: l1.add("e");

        // check if element exists
        // TODO: l1.contains("b");

        // get element by id
        // TC: O(1)
        // TODO: l1.get(2);

        // update
        // TC: O(1)
        // obj1.set(index, element);
        // TODO: l1.set(3,"p");

        // remove from list
        // TC: O(n) as shifting happens
        // TODO: l1.remove(0); // index
        // TODO: l1.remove("b"); // object removes first occurence of the object

        // sorting
        // TODO: l1.sort(null); // same as naturalOrder
        // TODO: l1.sort(Comparator.naturalOrder());

        // can also use Collection static method
        // TODO: Collections.sort(l1,null);

        // sublist
        // subList(int fromIndex inclusive, int toIndex exclusive )
        // TODO: List subList=l1.subList(2, 3);
        // TODO: System.out.println(subList);

        // TODO: l1.spliterator();
        // TODO: System.out.println(l1);

        // to array
        // simplest
        // TODO: Object[] array=l1.toArray();
        // TODO: String[] l2=l1.toArray(new String[0]); //convention to pass new Type[0] - just to mention the type

        
    }
}
