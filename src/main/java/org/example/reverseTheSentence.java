package org.example;

import java.util.Arrays;

public class reverseTheSentence {
    public static void main(String[] args) {
        String str=" My name is Sameer. I love Programming";

        String[] parts=str.split("\\.");

        //System.out.println(Arrays.toString(parts));

        StringBuilder result=new StringBuilder();
        for(String p:parts){
           p=p.trim();
           String[] words=p.split(" ");
           for(int i= words.length-1;i>=0;i--){
               result.append(words[i]).append(" ");
           }
           result.append(". ");

        }
        System.out.println(result.toString().trim());

        String s="sameer";
        String reversed="";


        for(int i=s.length()-1;i>=0;i--){

            reversed=reversed+s.charAt(i);

        }
        System.out.println("reversed String is " +reversed);
    }
}
