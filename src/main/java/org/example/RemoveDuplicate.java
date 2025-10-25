package org.example;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String str="sameer";
        removeDuplicate(str);

    }

    private static void removeDuplicate(String s) {
        String result="";

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(result.indexOf(c)==-1){
                result+=c;
            }
        }
        System.out.println(result);

    }
}
