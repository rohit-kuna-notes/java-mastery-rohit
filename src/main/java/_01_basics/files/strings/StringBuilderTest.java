package _01_basics.files.strings;

public class StringBuilderTest {
    public static void main(String[] args){

        StringBuilder sb=new StringBuilder();
        sb.append("Rakesh");
        sb.append("Khanna");
        sb.length();

        StringBuffer s2=new StringBuffer();
        s2.append("Hi");
        s2.append("hello");

        System.out.println(s2);
    }
}
