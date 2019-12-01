package arcade.intro.EdgeOfTheOcean.ArrayConsecutive;

import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        int[] array = {5, 4, 6};
        System.out.println(makeArrayConsecutive2(array));

    }

    static int makeArrayConsecutive2(int[] statues) {
        Arrays.sort(statues);
        int lastMinusFirst = statues[statues.length-1] - statues[0];
        return lastMinusFirst - statues.length + 1;
    }

}
