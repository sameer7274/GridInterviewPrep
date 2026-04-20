package org.example;

public class UniqueElement {
    public static void main(String[] args) {
        int a[]={1,1,3,3,4,4,5};
        int ans=0;
        for(int i=0;i<a.length;i++){
            ans= ans ^ a[i];
        }
        System.out.println("Unique Element is " +ans);
    }
}
