package practicespace.files;


import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {
        String a = "abcd";
        String b = "cbda";

        System.out.println(isAnagram(a, b));

    }

    static boolean isAnagram(String a, String b){
        Map<Character,Integer> hm1=new HashMap<>();
        Map<Character,Integer> hm2=new HashMap<>();
        for(char ch:a.toCharArray()){
            if(ch>'a'&&ch<'z'|| ch>'A'&&ch<'Z') {
                hm1.put(ch,hm1.getOrDefault(ch, 0)+1);
            }
        }
        for(char ch:b.toCharArray()){
            if(ch>'a'&&ch<'z'|| ch>'A'&&ch<'Z') {
                hm2.put(ch,hm2.getOrDefault(ch, 0)+1);
            }
        }

        return hm1.equals(hm2);
    }
}
