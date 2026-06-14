package misc;

import java.util.Arrays;
import java.util.Comparator;

public class SnippetsPhase1 {
    public static void main(String[] args){

        // TODO: int[] arr={1,23,76,98};
        // sum
        // max

        // TODO: int[][] matrix={{1,2},{6,3},{4,5}};
        // sort acc to 1st element
        // using Anonymous function
        Arrays.sort(matrix, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b){
                // TODO: return Integer.compare(a[0], b[0]);
            }
        });
        // using lambda
        // TODO: Arrays.sort(matrix,(a,b)->Integer.compare(a[0], b[0]));




    }

    // max
    private int getMax(int[] arr){
        // TODO: int max=Integer.MIN_VALUE;
        for(int p : arr){
            if(p>max){
                // TODO: max=p;
            }
        }
        // TODO: return max;
    }

    // sum
    private int getSum(int[] arr){
        // TODO: int sum=0;
        for(int p:arr){
            // TODO: sum+=p;
        }
        // TODO: return sum;
    }


}
