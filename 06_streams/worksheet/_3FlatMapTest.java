
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class _3FlatMapTest {
    public static void main(String[] args) {
        // TODO: List<List<String>> sentences = Arrays.asList(
            // TODO: Arrays.asList("Hello", "World"),
            // TODO: Arrays.asList("Java", "Streams"),
            // TODO: Arrays.asList("FlatMap", "Example")
        );

        // Without flatMap: Stream<Stream<String>>
        // With flatMap: Stream<String>
        // TODO: List<String> allWords1 = sentences.stream()
            // TODO: .flatMap(s->s.stream())
            // TODO: .collect(Collectors.toList());

        // TODO: List<String> allWords2 = sentences.stream()
            // TODO: .flatMap(Collection::stream)
            // TODO: .collect(Collectors.toList());

        // TODO: System.out.println(allWords1);
    }
}

