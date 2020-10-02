package com.cd.maximum.profit;

public class MaxProfit {

    public Integer find(Integer[] input){
        int maxProfit = -1;
        int buyPrice = 0;
        int sellPrice = 0;

        boolean isBuy = true;

        for(int i = 0; i < input.length - 1; i++) {
            sellPrice = input[i + 1];

            if(isBuy) {
                buyPrice = input[i];
            }

            if(sellPrice < buyPrice) {
                isBuy = true;
            } else {
                int tempProfit = sellPrice - buyPrice;
                if(tempProfit > maxProfit) {
                    maxProfit = tempProfit;
                }
                isBuy = false;
            }
        }

        return maxProfit;
    }
}
