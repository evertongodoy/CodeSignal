package arcade.intro.IslandOfKnowledge.MaximalAdjacent;

public class Main {

    public static void main(String[] args){
        int[] array = {2,4,1,0};
        System.out.println(arrayMaximalAdjacentDifference(array));
    }

    static int arrayMaximalAdjacentDifference(int[] inputArray) {

        if(inputArray.length <= 1) return 0;

        int finalNumber = 0;

        for(int n = 1; n < inputArray.length; n++) {
            int diff = inputArray[n] - inputArray[n-1];

            if(diff < 0) diff*=-1;

            if(diff > finalNumber) finalNumber = diff;

        }

        return finalNumber;
    }


}
