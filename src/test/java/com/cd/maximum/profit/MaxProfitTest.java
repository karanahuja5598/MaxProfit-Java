package com.cd.maximum.profit;

import org.junit.Assert;
import org.junit.Test;

public class MaxProfitTest {

    @Test
    public void findTest(){
        MaxProfit maxProfit = new MaxProfit();
        int expected = 16;
        Integer[] input = {45, 24, 35, 31, 40, 38, 11} ;
        int actual = maxProfit.find(input);
        Assert.assertEquals(expected,actual);
    }
}
