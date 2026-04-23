package DSA_PROBLEMS;

import java.util.*;

public class Frequency {
    public static void main(String[] args) {

        // Word count Frequency
        String text="My name is sameer raj";

        String[] words=text.toLowerCase().split("\\s+");

        System.out.println(Arrays.toString(words));

        Map<String,Integer> freq=new HashMap<>();
        for(String word:words){
            freq.merge(word,1,Integer::sum);
        }
        System.out.println(freq);


        // Character Count Frequency;
        String test="sameeer";
        Map<Character,Integer> f=new HashMap<>();
        for(char c: test.toCharArray()){
            f.merge(c,1,Integer::sum);
        }
        System.out.println(f);

        String w="jnfjadhbhsbvanfsnvvbabvianavevwindkwifvw";
        Map<Character,Integer> fr=new HashMap<>();

        for(char a:w.toCharArray()){
            fr.merge(a,1,Integer::sum);
        }
        System.out.println(fr);


/*
     You can see if you use HashSet character order is not gurantee
     but when you use LinkedHashSet.
     in same order as first occurance.


 */
        String ss="dschbhbdfhvbsssssssf";
        //Set<Character> s=new HashSet<>();
        Set<Character> s=new LinkedHashSet<>();
        for(char c:ss.toCharArray()){
            s.add(c);
        }
        System.out.println(s);





    }
}
