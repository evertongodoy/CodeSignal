package arcade.intro.EdgeOfTheOcean.MatrixElement;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        int[][] matrix = { {0,1,1,2}, {0,5,0,0},  {2,0,3,3} };
        System.out.println(matrixElementsSum(matrix));
    }

    static int matrixElementsSum(int[][] matrix) {


        List<Integer> forbiddenCol = new ArrayList<Integer>();
        int sum = 0;

        for(int x=0; x < matrix.length; x++ ) { // LINHAS
            for(int y = 0; y < matrix[0].length; y++) { // COLUNAS

                if(!forbiddenCol.contains(y)) {
                    if(matrix[x][y] == 0) {
                        forbiddenCol.add(y); // Keep the column forbiden
                        Collections.sort(forbiddenCol);
                    } else {
                        sum=+sum+matrix[x][y];
                    }
                }
                //System.out.println("Valor = " + matrix[x][y]);
            }
            //System.out.println("");
        }
        //System.out.println(sum);
        return sum;
    }

}
