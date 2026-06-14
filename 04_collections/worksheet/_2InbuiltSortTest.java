
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class _2InbuiltSortTest {

    // sort functions
    // Arrays.sort();
    // Collections.sort()

    public static void main(String[] args){
        // sorting in array
        // TODO: int[] numsPrimitive= {1,9,3,42,5,2};
        // TODO: Arrays.sort(numsPrimitive); // asc
        // We can't pass Comparator.reverseOrder() in Arrays.sort() for primitive data

        // Therefore we can use Integer instead, if we wanna pass comparator
        // TODO: Integer[] numsInteger = {2,18,5,9,4};
        // TODO: Arrays.sort(numsInteger, Comparator.reverseOrder());
        // for natural order
        // TODO: Arrays.sort(numsInteger,Comparator.naturalOrder());

        // sorting in collection (can create list using any List creation method)
        // TODO: List<String> letters = Arrays.asList("C","D","B","A");
        // TODO: Collections.sort(letters);

        // naturalOrder
        // TODO: Comparator<String> natural = Comparator.naturalOrder();
        // reverseOrder
        // TODO: Comparator<String> rev1 = Comparator.reverseOrder();
        // TODO: Comparator<String> rev2 = Collections.reverseOrder();

        // So we can pass it in sort() as Comparator
        // TODO: Collections.sort(letters,Collections.reverseOrder());
        // TODO: Collections.sort(letters,Comparator.reverseOrder());
        
        //we can also do
        // TODO: letters.sort(Comparator.naturalOrder()); // Note: Comparator needs to be passed atleast as Comparator.naturalOrder (so that if class have Overidden compareTo i.e. Comparable get's activated)
        
        // This is completely different not sorting descending order but only mirrors current order 
        // TODO: List<Integer> numsList = Arrays.asList(3,2,6,1,8);
        // TODO: Collections.reverse(numsList); // reverse
        // TODO: System.out.println(numsList); // [8, 1, 6, 2, 3]

    }

}

