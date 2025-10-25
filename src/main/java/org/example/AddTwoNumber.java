package org.example;

public class AddTwoNumber {
    public static void main(String[] args) {
        String  str="ssameer";
        findFirst(str);
        //System.out.println(result==0?"not found":result);

    }

    public static void findFirst(String s) {
        int[] freq = new int[256];
        for (char c : s.toCharArray()) {
            freq[c]++;
        }
        for (char c : s.toCharArray()) {
            if (freq[c] != 0) {
                System.out.println(c + "----" + freq[c]);
                freq[c] = 0;
            }
        }

    }
}
