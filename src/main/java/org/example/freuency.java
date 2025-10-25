package org.example;

public class freuency {
    public static void main(String[] args) {
        String s="SameerE";
        int[] freq=new int[256];
        s=s.toLowerCase();

        for(char c: s.toCharArray()){
            freq[c]++;

        }
        int max=-1;
        char maxchar=' ';
        for(char c:s.toCharArray()){
            if(freq[c]>max){
                max=freq[c];
                maxchar=c;
            }
        }
        System.out.println("Max frequency "+ maxchar+" is "+max);
    }
}
