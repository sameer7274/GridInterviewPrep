package org.example;

public class FirstOcc {
    public static void main(String[] args) {

      //  String str="hello";
        String str="hello";
        char result=findFirstNonRepeatedChar(str);
        System.out.println(result==0?"no unique char":result);

    }

    private static char findFirstNonRepeatedChar(String s) {
       int[] freq=new int[256];

       for(char c:s.toCharArray()){
           freq[c]++;
       }

//
        for(char c:s.toCharArray()){
            if(freq[c]==1)
            {
                return c;
            }
        }
        return 0;

    }
}
