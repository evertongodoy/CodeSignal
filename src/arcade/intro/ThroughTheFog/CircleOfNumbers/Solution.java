package arcade.intro.ThroughTheFog.CircleOfNumbers;

public class Solution {

    static int circleOfNumbers(int n, int firstNumber) {
        return (firstNumber == (n/2) ? 0 : (firstNumber >= (n/2)) ? firstNumber + (n/2) - n : firstNumber + (n/2));
    }

    public static void main(String[] args){
        System.out.println(circleOfNumbers(10, 2));
    }
}
