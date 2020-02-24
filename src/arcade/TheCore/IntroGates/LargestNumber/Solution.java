package arcade.TheCore.IntroGates.LargestNumber;

public class Solution {

    static int largestNumber(int n) {

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++){
            sb.append("9");
        }

        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args){
        System.out.println(largestNumber(7));
    }
}
