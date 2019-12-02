package arcade.intro.ExploringTheWaters.ArrayChange;

public class Main {

    public static void main(String[] args){

        int[] array = {-1000, 0, -2, 0};
        System.out.println(arrayChange(array));
    }

    static int arrayChange(int[] inputArray) {

        int count = 0;

        for(int i = 1; i < inputArray.length; i++) {
            while(inputArray[i] <= inputArray[i-1]) {
                inputArray[i] = inputArray[i] + 1;
                count++;
            }
        }

        return count;

    }

}
