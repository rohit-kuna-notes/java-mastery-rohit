
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.List;

public class _1CreateStream {

    public static void main(String ...args){

        // from all of the following methods the stream object created is of same class
        // obj.getClass() ---> class java.util.stream.ReferencePipeline$Head

        // From arrays
        // TODO: String[] array={"A","B","C"};
        // TODO: Stream<String> arrayStream = Arrays.stream(array);

        // From List create from any method of creating List
        // TODO: List<String> list = List.of("A","B","C");
        // TODO: Stream<String> listStream = list.stream();
        // TODO: Stream<String> listParallelStream = list.parallelStream(); // in case you want to create a parallel stream

        // Using Stream.of() directly
        // TODO: Stream<String> streamDirect = Stream.of("A","B","C");

        // Using Stream.iterate() used when you want to create a stream integers
        Stream<Integer> streamByIterate = Stream.iterate(0,n->n+1).limit(4);
        // TODO: streamByIterate.forEach(System.out::print);

    }
    
}
