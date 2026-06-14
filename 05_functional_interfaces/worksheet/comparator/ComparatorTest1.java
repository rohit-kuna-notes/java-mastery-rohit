package comparator;

import java.util.Comparator;
import java.util.Arrays;

// Simplest example of how to create a comparator Object
public class ComparatorTest1 {

    public static void main(String[] args){
        // TODO: int[][] matrix={{1,2},{6,3},{4,5}};

        // TODO: CompareFirstIndex comp1=new CompareFirstIndex();
        // TODO: Arrays.sort(matrix,comp1);
    }

    public static class CompareFirstIndex implements Comparator<int[]>{ // implements Comparator<T>

        @Override
        public int compare(int[] arg0, int[] arg1) {
            // TODO: return Integer.compare(arg0[0],arg1[0]);
        }

    }

}
