package arcade.intro.RainsOfReason.ArrayReplace;

public class Main {

    public static void main(String[] args){

        int[] inputArray = {1, 2, 1};
        int elemToReplace = 1;
        int substitElem = 3;

        for(int x : arrayReplace(inputArray,elemToReplace,substitElem)){
            System.out.print(x + ", ");
        }

    }

    static int[] arrayReplace(int[] inputArray, int elemToReplace, int substitutionElem) {

        for(int x = 0; x < inputArray.length; x++) {
            if(inputArray[x] == elemToReplace) {
                inputArray[x] = substitutionElem;
            }
        }

        return inputArray;
    }

}
