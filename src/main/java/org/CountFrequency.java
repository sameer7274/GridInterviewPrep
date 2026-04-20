package org;

import java.util.HashMap;
import java.util.Map;

public class CountFrequency {
    public static void main(String[] args) {
        int[] arr={1,2,3,2,4,3,4,5,2};
        Map<Integer,Integer> freqMap=new HashMap<>();
        int maxFreq = 0;
        int mostFrequent = arr[0];

        for(int num:arr){
            int count=freqMap.getOrDefault(num,0)+1;
            freqMap.put(num,count);
            if(count>maxFreq){
                maxFreq=count;
                mostFrequent=num;
            }
        }
        System.out.println("MAX freq "+maxFreq);
        System.out.println("Most Frequent is "+mostFrequent);
    }
}
