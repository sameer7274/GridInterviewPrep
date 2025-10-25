package org.example;

public class maxProfit {
    public static void main(String[] args) {
        int[] prices={1,2,9,7,6};
        int minprice=Integer.MAX_VALUE;
        int maxprofit=0;

        for(int p:prices){
            if(p<minprice){
                minprice=p;
            }
            int profit=p-minprice;
            if(profit>maxprofit){
                maxprofit=profit;
            }
        }
        System.out.println("Max Profit is "+maxprofit);

    }

}
