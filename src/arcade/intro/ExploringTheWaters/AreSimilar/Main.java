package arcade.intro.ExploringTheWaters.AreSimilar;

import java.util.Arrays;

public class Main {


    public static void main(String[] args){
        int[] arrayA = {832, 998, 148, 570, 533, 561, 894, 147, 455, 279};
        int[] arrayB = {832, 998, 148, 570, 533, 561, 455, 147, 894, 279};

        if(areSimilar(arrayA, arrayB)){
            System.out.println("true");
        } else{
            System.out.println("false");
        }

    }

    static boolean areSimilar(int[] a, int[] b) {
        if (a.length != b.length)
            return false; // If the size is different, impossible to be similar

        // New Arrays
        int[] copyA = new int[a.length];
        for(int i = 0; i < a.length; i++) {
            copyA[i] = a[i];
        }

        int [] copyB = new int[b.length];
        for(int i = 0; i < b.length; i++) {
            copyB[i] = b[i];
        }

        // Order the new Array
        Arrays.sort(copyA);
        Arrays.sort(copyB);

        int countSwap = 0;

        // If they are different, impossible to be similar again
        if (!Arrays.equals(copyA, copyB))
            return false;

        // If equal, I'll count how many time we need to change each one.
        // 2 or 0, it means OK, more than 2, NO OK because I'll need to change more de 2 positions
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                countSwap++;
        }

        // countSwap == 2, because if I need to change one position, are two positions in the same time,
        // e.g,  A = [a, b, c, d, e]  and B = [b, a, c, d, e], so I need to change "a" with "b" and "b" with "a"
        return (countSwap == 2 || countSwap == 0);
    }

}
