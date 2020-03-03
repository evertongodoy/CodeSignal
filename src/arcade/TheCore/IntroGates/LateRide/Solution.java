package arcade.TheCore.IntroGates.LateRide;

public class Solution {

    static int lateRide(int n) {
        String time = n/60 + "" +  n % 60;
        int ret = 0;
        for(char c : time.toCharArray()){
            ret+= Character.getNumericValue(c);
        }

        return ret;
    }

    public static void main(String[] args) {
        System.out.println(lateRide(808));
    }
}
