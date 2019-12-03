package arcade.intro.IslandOfKnowledge.BoxBlur;

public class Main {

    public static void main(String[] args){
        int[][] matrix = { {7,4,0,1}, {5,6,2,2}, {6,10,7,8}, {1,4,2,0} };
        int[][] ret = boxBlur(matrix);

        for(int x = 0; x < ret.length; x++){
            for(int y = 0; y < ret[0].length; y++){
                System.out.print(ret[x][y] + " ");
            }
        }
    }

    static int[][] boxBlur(int[][] image) {
        int newRow = 0;
        int newCol = 0;

        int imageReturn[][] = new int[image.length-2][image[0].length-2];

        // Line
        for(int i = 1; i < image.length-1; i++ ) {
            // Restart new Column
            newCol = 0;

            // Col
            for(int j = 1; j < image[0].length - 1; j++) {

                // Here I'll calculate
                int start, middle, end, total = 0;

                start = image[i-1][j-1] + image[i-1][j] + image[i-1][j+1];
                middle = image[i][j-1] + image[i][j] + image[i][j+1];
                end = image[i+1][j-1] + image[i+1][j] + image[i+1][j+1];

                total = (start + middle + end) / 9;

                imageReturn[newRow][newCol] = total;

                newCol++;
            }
            newRow++;
        }




        return imageReturn;
    }

}
