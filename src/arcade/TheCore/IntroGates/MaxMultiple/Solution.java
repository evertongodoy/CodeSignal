package arcade.TheCore.IntroGates.MaxMultiple;

public class Solution {

    static int maxMultiple(int divisor, int bound) {
        while(true) {
            if(bound % divisor == 0){
                return bound;
            }
            bound--;
        }
    }

    public static void main(String[] args) {
        System.out.println(maxMultiple(13, 1239));
    }
}