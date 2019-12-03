package arcade.intro.IslandOfKnowledge.MineSweeper;

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        boolean[][] table = {{true, false, false},
                             {false, true, false},
                             {false, false, false}
                            };
        minesweeper(table);
    }

    static int[][] minesweeper(boolean[][] matrix) {
        int[][] ret = new int[matrix.length][matrix[0].length];

        for(int x = 0; x < matrix.length; x++) {
            for(int y = 0; y < matrix[0].length; y++) {

                List<Integer> validRows = new ArrayList<Integer>();
                List<Integer> validCols = new ArrayList<Integer>();
                int mines = 0;

                // Always ok
                validRows.add(x);
                validCols.add(y);

                // Test Row
                if(x-1 >= 0) {
                    validRows.add(x-1);
                }
                if(x+1 < matrix.length) {
                    validRows.add(x+1);
                }

                // Test Col
                if(y-1 >= 0) {
                    validCols.add(y-1);
                }
                if(y+1 < matrix[0].length) {
                    validCols.add(y+1);
                }
                //System.out.println("teste");

                for(int row : validRows) {
                    for(int col : validCols) {
                        // Cannot be considered the current position
                        if(row != x || col != y) {
                            if(matrix[row][col] == true ) {
                                mines++;
                            }
                        }
                    }
                }
                ret[x][y] = mines;
            }
        }

        return ret;
    }

}
