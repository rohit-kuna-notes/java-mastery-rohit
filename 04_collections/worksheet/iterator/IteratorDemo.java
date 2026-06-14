package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Arrays;

public class IteratorDemo {
    public static void main(String[] args){
        // TODO: ArrayList<Integer> list =new ArrayList<>();
        // As ArrayList extends iterable we get the foreach function
        for(int p:list){
            // TODO: System.out.println(p);
        }

        // JVM translates foreach internally into this
        // TODO: Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){ // think of this as stream 1 2 3 4 . . . But hasNext just checks if next element is present
            // TODO: System.out.println(iterator.next());
        }

        // list.iterator() -> returns an object of type iterator
        // iterator.hasNext() -> checks if next element is present
        // iterator.next() -> returns the next element
        // iterator.remove() -> removes while ietrating (powerful as in simple foreach loop we get concurrent modification exception)

        // Think of itr object as a pointer
        // TODO: ArrayList<Integer> numbers=new ArrayList<>(Arrays.asList(1,2,3,4,6,7,9));
        // TODO: Iterator<Integer> temp=numbers.iterator();
        while(temp.hasNext()){
            // TODO: Integer number = temp.next();
            if(number%2==0){
                // TODO: temp.remove();
            }
        }
        // TODO: System.out.println(numbers); // see heer we don't get concurrent modification exception

        // similarly we also have listobject.listIterator()
        // TODO: ListIterator<Integer> listIterator = numbers.listIterator();
        // this has many more methods we have
        // hasPrevious() -> checks if previous element to the pointer exists
        while(listIterator.hasPrevious()){
            // TODO: Integer number=listIterator.previous();
            if(number%2!=0){
                // TODO: listIterator.set(0); // we can set too
            }
        }
        // TODO: System.out.println(listIterator);

    }
}
