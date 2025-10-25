package org.example;

public class AddTwoNumberWithoutArthimetic {
    public static void main(String[] args) {
        int num1=10,num2=11;
        System.out.println("sum is "+add(num1,num2));
    }

    public  static int  add(int a, int b) {
        while(b!=0){
            int carry=a&b;
            a=a^b;
            b=carry<<1;

        }
        return a;
    }
}
