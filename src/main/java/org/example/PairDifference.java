package org.example;

import java.util.ArrayList;
import java.util.List;

public class PairDifference {
    public static void main(String[] args) {
        int[] arr={4,2,6,1,6,7,-1};
        int k=2;
        List<List<Integer>> pairs=findPair(arr,k);
        System.out.println(pairs);
    }

    private static List<List<Integer>> findPair(int[] arr, int k) {
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i!=j&& arr[i]-arr[j]==k){
                    List<Integer> pair=new ArrayList<>();
                    pair.add(arr[i]);
                    pair.add(arr[j]);
                    result.add(pair);
                }
            }
        }
        return result;
    }

}
