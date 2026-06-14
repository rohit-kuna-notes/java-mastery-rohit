import java.util.List;

public class _4StringTest {
    public static void main(String[] args){
        // Strings are immutable

        // defining string
        // TODO: String s1="Hello";

        // Any Object to String -> obj.toString()
        // TODO: Integer num=100;
        // TODO: String numString = num.toString();
        // TODO: String numString2= String.valueOf(num);

        // Length -> s1.length() method
        // TODO: int len=s1.length();

        // Concatenation
        // TODO: String s2=s1+"thanks";
        // TODO: String s3=s1.concat("great");

        // to get the character at particular index -> s.charAt(index)
        // TODO: char ch=s1.charAt(1);

        // String to char array
        // TODO: char[] charArray = s1.toCharArray();

        // Methods on strings
        // NOTE : When ever we apply string modification methods the string is not affected a new string is returned every time
        // as String is immutable

        // Substring -> similar to python slicing
        // s.substring(beginIndex) -> beginIndex to lastIndex
        // TODO: s1.substring(2);

        // s.substring(beginIndex,endIndex] -> endIndex is excluded
        // TODO: s1.substring(1,4);

        // equality
        // TODO: boolean eq1=s1.equals(s2);

        // Compare
        // Does lexicograpically comparison and and first char which is different the ascii diff is returned
        // TODO: String r1="rest";
        // TODO: String r2="resp";
        // TODO: int diff = 't'-'p'; // 4
        // TODO: int compareRes1=r1.compareTo(r2); // 4 // this compareTo is overriden method as String implements Comparable
        // TODO: System.out.println(diff==compareRes1);

        // if one finishes before another returns r3.length() - r4.length()
        // TODO: String r3="cool";
        // TODO: String r4="coolie";
        // TODO: int diff2=r3.length()-r4.length(); // 2
        // TODO: int compareRes2=r3.compareTo(r4); // 2
        // TODO: System.out.println(diff2==compareRes2);

        // caps come before smaller due to lower ascii of caps
        // A -> 65
        // a-> 97
        // TODO: int compareRes3="asiA".compareTo("asia");
        // TODO: System.out.println(compareRes3<0); // should be negative

        // TODO: int compareRes4=s1.compareToIgnoreCase(s2);

        // res < 0 -> s1 before s2
        // res = 0 -> s1 == s2
        // res > 0 -> s1 after s2

        // String formatting methods
        // TODO: s1.toLowerCase();
        // TODO: s1.toUpperCase();

        // TODO: String words="    Hello World             ";
        // TODO: System.out.println(words.trim()); // remove all spaces

        // TODO: String name="om priya shanti priya";
        // TODO: name.contains("priya"); // true
        // TODO: String replaced=name.replace("priya","jaya");
        // TODO: System.out.println(replaced);

        // TODO: name.startsWith("om");
        // TODO: name.endsWith("a");

        // Join
        // TODO: List<String> list1=List.of("This","is","a","sentence");
        // TODO: String[] list2={"This","is","another"};
        // TODO: String sentence2=String.join("-", list1);
        // TODO: String sentence3=String.join(" ", list2);
        // TODO: System.out.println(sentence2);

        // Split
        // TODO: String tobesplit="Hi hello there";
        // TODO: String[] wordsArray=tobesplit.split(" ");

        // char to string
        // TODO: char ch1='a';
        // TODO: String chStr=String.valueOf(ch1);
        // TODO: String chStr2=Character.toString(ch1);

        // String to char
        // TODO: String str2="A";
        // TODO: char ch2=str2.charAt(0);

        // Joining chars back to string
        // TODO: char[] charArray2={'a','b','c'};

        // as Strin.valueOf() takes char[] too
        // TODO: String.valueOf(charArray2);

        // simplest
        // TODO: String res=new String(charArray2);

        // format
        // TODO: String arg0="Anil";
        // TODO: int arg1=2;
        // TODO: String f1=String.format("Hi there %s, a table for %d" , arg0, arg1);
        // TODO: System.out.println(f1);

    }
}
