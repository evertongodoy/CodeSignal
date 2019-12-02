package arcade.intro.SmoothSailing.SortHeight;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args){
        int[] array = {-1, 150, 190, 170, -1, -1, 160, 180};
        for(int i : sortByHeight(array)){
            System.out.print(i + ", ");
        }
    }

    /**
     * Your task is to rearrange the people by their heights in a non-descending order without moving the trees
     *
     * Input:
     a: [-1, 150, 190, 170, -1, -1, 160, 180]
     Expected Output:
     [-1, 150, 160, 170, -1, -1, 180, 190]
     * @param a
     * @return
     */
    static int[] sortByHeight(int[] a) {

        List<Integer> lstNums = new ArrayList<Integer>();

        for(int n : a) {
            if(n != -1) {
                lstNums.add(n); // Removing negatives
            }

        }
        Collections.sort(lstNums); // Sort the list

        int b = 0;
        for(int i = 0; i < a.length; i++) {
            if(a[i] != -1) {
                a[i] = lstNums.get(b); // Changing the positions
                b++;
            }
        }

        return a;
    }

}
