package arcade.intro.IslandOfKnowledge.AvoidObstacles;

public class Main {

    public static void main(String[] args){

        int[] array = {5,3,6,7,9};
        System.out.println(avoidObstacles(array));
    }

    static int avoidObstacles(int[] inputArray) {
        int num = 1;

        for(int i=0; i<inputArray.length; i++) {
            if(inputArray[i] %num ==0) {
                num++;
                i=-1;
            }
        }
        return num;
    }

}
