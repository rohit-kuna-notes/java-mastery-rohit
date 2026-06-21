package practicespace.files;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class CollectionPractice {
    public static void main(String[]args){
        //create a list
        String[] arrayOfStrings = new String[200];// fix size
        List<String> fixed = Arrays.asList("a", "b"); // fixed but mutable
        List<String> immutableList = List.of("A","B");
        List<String> mutableArrayList = new ArrayList<>(Arrays.asList("aa","bb"));



    }
}
