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

        /*
        Remove the duplicate character from a word

         */

        StringBuilder sb=new StringBuilder();

        boolean[] seen =new boolean[256];

        for(char c:ss.toCharArray()){
            if(!seen[c]){
                sb.append(c);
                seen[c]=true;
            }

        }

        System.out.println("Original " +ss);
        System.out.println("Result "+ sb.toString());

        /*
        Remove duplicate word
         */
        String s2="what si is what is ";

        String[] s3=s2.split("\\s+");

        System.out.println(Arrays.toString(s3));

        StringBuilder sb1=new StringBuilder();

        HashSet<String> seen1=new HashSet<>();

        for(String s4:s3){
            if(!seen1.contains(s4)){
                sb1.append(s4).append(" ");
                seen1.add(s4);
            }

        }
        System.out.println("Result "+ sb1.toString());




    }
}
