
import java.util.function.Predicate;
import java.util.List;

public class _1PredicateTest {
    public static void main(String[] args) {
        // Functional interfaces is used as reference type for lambda expressions
        // Predicate is a functional interface
        // It helps us store conditions in a variable
        // TODO: Predicate<Integer> isEven = x->x%2==0;
        // TODO: Predicate<Integer> isOdd = isEven.negate(); // to get condition's opposite

        // TODO: List<Integer> evenList=List.of(-4,0,1,2,3,4).stream().filter(isEven).toList();
        // TODO: System.out.println(evenList);

        // TODO: Predicate<String> startsWithV = s->s.charAt(0)=='v';
        // TODO: Predicate<String> endsWithL = s->s.charAt(s.length()-1)=='l';
        // TODO: Predicate<String> startsWithVAndEndsWithL=startsWithV.and((endsWithL));
        // TODO: System.out.println(startsWithVAndEndsWithL.test("vipul"));

        // TODO: Predicate<String> startsWithVOrEndswithL=startsWithV.or(endsWithL);
        // TODO: System.out.println(startsWithVOrEndswithL.test("Paul"));

        // isEqual is a static method of Predicate interface
        // Predicate.isEqual() checks values (content), not object references.
        // TODO: String a=new String("Here");
        // TODO: String b=new String("Here");
        // TODO: System.out.println(a==b);
        // TODO: Predicate<String> equalOrNot= Predicate.isEqual(b);
        // TODO: System.out.println(equalOrNot.test(a));

    }
}
