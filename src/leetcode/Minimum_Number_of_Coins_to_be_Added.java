package leetcode;

import java.util.Arrays;

public class Minimum_Number_of_Coins_to_be_Added {
    public int minimumAddedCoins(int[] coins, int target) {
        Arrays.sort(coins);  // Sort the coins array

        int currentMax = 0;
        int coinsToAdd = 0;
        int i = 0;

        while (currentMax < target) {
            if (i < coins.length && coins[i] <= currentMax + 1) {
                // Add the value of the current coin to the maximum obtainable sum
                currentMax += coins[i];
                i++;
            } else {
                // Add a new coin equal to currentMax + 1
                currentMax += currentMax + 1;
                coinsToAdd++;
            }
        }

        return coinsToAdd;
    }
}
