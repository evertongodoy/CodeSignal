package arcade.intro.ThroughTheFog.DepositProfit;

import java.math.BigDecimal;

public class Solution {

    static int depositProfit(int deposit, int rate, int threshold) {

        int yearPass = 0;
        float balance = deposit;

        do {
            balance = (balance * (float) rate/100) + balance ;
            yearPass++;
        } while (balance < threshold);

        return yearPass;
    }

    public static void main(String[] args){
        System.out.println(depositProfit(100, 20, 170));
    }
}
