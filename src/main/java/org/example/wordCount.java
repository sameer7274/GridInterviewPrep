package org.example;

import java.util.HashMap;
import java.util.Map;

public class wordCount {
    public static void main(String[] args) {
        String fruits="Apple,Banana,Apple,Cherry";

        String[] fruitArray=fruits.split(",");
        Map<String,Integer> fruitCount=new HashMap<>();
        for(String f:fruitArray){
            f=f.trim();
            fruitCount.put(f,fruitCount.getOrDefault(f,0)+1);

        }
        for(Map.Entry<String,Integer>entry:fruitCount.entrySet()){
            System.out.println(entry.getKey()+" = "+ entry.getValue());

        }
    }
}
