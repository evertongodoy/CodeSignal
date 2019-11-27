package arcade.intro.EdgeOfTheOcean.AdjacentElementsProd;

public class Main {

    public static void main(String[] args){

        int[] vet = {3, 6, -2, -5, 7, 3};
        System.out.println(adjacentElementsProduct(vet));
    }


    static int adjacentElementsProduct(int[] inputArray) {

        int max = inputArray[0]*inputArray[1];

        for(int i = 2; i < inputArray.length; i++){
            if(inputArray[i-1]*inputArray[i] > max){
                max = inputArray[i-1]*inputArray[i];
            }
        }
        return  max;
    }

}
