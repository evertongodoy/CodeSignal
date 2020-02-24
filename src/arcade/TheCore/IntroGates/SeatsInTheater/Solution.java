package arcade.TheCore.IntroGates.SeatsInTheater;

public class Solution {

    static int seatsInTheater(int nCols, int nRows, int col, int row) {

        int colRes = (nCols - col)+1; // +1 because I need to consider all people from the same column than my
        int rowRes = nRows - row;     // I don't need to consider people from my row

        return colRes * rowRes;
    }

    public static void main(String[] args) {
        System.out.println(seatsInTheater(16, 11,5,3));
    }
}
