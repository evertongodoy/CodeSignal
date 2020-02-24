package arcade.TheCore.IntroGates.Candies;

public class Solution {

    static int candies(int n, int m) {

        int candiesEaten = 0;

        if(n > m){
            return 0;
        } else if(n == 1){
            return m;
        }else {
            candiesEaten = ((m/n) * n);
        }
        return candiesEaten;
    }


    public static void main(String[] args){
        System.out.println(candies(4,15));
    }

}
