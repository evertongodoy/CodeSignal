package arcade.intro.ThroughTheFog.AbsoluteValuesSumMinimization;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.*;

public class Solution {

    static int absoluteValuesSumMinimization(int[] a) {

        int closest = 0;
        int aux = 0;

        Boolean first = Boolean.TRUE;

        int previousSum = 0;

        for(int x = 0; x < a.length; x++){ //  x number
            int sum = 0;

            for(int y = 0; y < a.length; y++){ // a[x] position
                aux = a[y] - a[x];
                if (aux < 0) aux *= -1;
                sum+=aux;
            }

            if(first){
                closest = a[x];
                first = Boolean.FALSE;
                previousSum = sum;
            } else {
                if(sum < previousSum){
                    closest = a[x];
                    previousSum = sum;
                }
            }

        }
        return closest;
    }

    public static void main(String[] args){
         // int[] arr = {2, 4, 7};  // R: 4
         // int[] arr = {1,1,3,4};  // R: 1
         // int[] arr = {2,3};  // R: 2
        int[] arr = {-1000000, -10000, -10000, -1000, -100, -10, -1, 0, 1, 10, 100, 1000, 10000, 100000, 1000000};   // R: 0
        System.out.println(absoluteValuesSumMinimization(arr));
    }
}
