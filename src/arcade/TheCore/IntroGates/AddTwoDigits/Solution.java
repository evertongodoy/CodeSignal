package arcade.TheCore.IntroGates.AddTwoDigits;

public class Solution {

    static int addTwoDigits(int n) {
        char n1 = String.valueOf(n).charAt(0);
        char n2 = String.valueOf(n).charAt(1);
        return Character.getNumericValue(n1)+Character.getNumericValue(n2);
    }

    public static void main(String[] args){
        System.out.println(addTwoDigits(12));
    }
}
