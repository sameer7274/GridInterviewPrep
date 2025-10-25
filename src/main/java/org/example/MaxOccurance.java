package org.example;

import java.util.Locale;

public class MaxOccurance {
    public static void main(String[] args) {
        String str="programmmmMMMing";
        printMaxOccur(str);

    }

    private static void printMaxOccur(String s) {
        int[] freq=new int[256];
        s=s.toLowerCase();
        for(char c:s.toCharArray()){
            freq[c]++;

        }
        int max=-1;
        char maxchar=' ';

        for(char c:s.toCharArray()){
            if(freq[c]>max){
                max=freq[c];
                maxchar=c;

            }

            if(freq[c]!=0){
                System.out.println(c+" -> "+freq[c]);
                freq[c]=0;
            }

        }
        System.out.println("MaxChar "+ maxchar +" "+max);


    }
}
