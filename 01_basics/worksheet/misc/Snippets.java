package misc;

import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.IntStream;

public class Snippets{
    public static void main(String[] args){

        // max in array
        // TODO: int[] arr={1,23,30,14,5};
        // TODO: int max=Arrays.stream(arr).max().getAsInt();

        // similarly sum
        // TODO: int sum=Arrays.stream(arr).sum();

        // In 2D array sort by 1st value asc
        // TODO: int[][] matrix={{11,2},{2,3},{6,8}};
        // TODO: Arrays.sort(matrix,(a,b)->Integer.compare(a[0],b[0]));
        for (int i = 0; i < matrix.length; i++) {          // rows
            for (int j = 0; j < matrix[i].length; j++) {   // columns
                // TODO: System.out.print(matrix[i][j] + " ");
            }
            // TODO: System.out.println();
        }


        // Convert array to stream
        // TODO: IntStream intStream=Arrays.stream(arr);
        // Integer Stream
        // TODO: Stream<Integer> integerStream=Arrays.stream(arr).boxed();

        // what is boxed and mapToInt


    }

    static int getMax(int[] arr){
        // TODO: int res=Integer.MIN_VALUE;
        for(int p:arr){
            if(p>res){
                // TODO: res=p;
            }
        }
        // TODO: return res;
    }
}
