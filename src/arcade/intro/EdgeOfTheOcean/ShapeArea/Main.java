package arcade.intro.EdgeOfTheOcean.ShapeArea;

public class Main {

    public static void main(String[ ] args){
        System.out.println(shapeArea(3));
    }


    static int shapeArea(int n) {

        int newLine = 0;
        int biggestLine = 0;
        int total = 0;

        if(n == 1) {
            return n;
        } else {
            // with n = 6 = biggest line is 11
            biggestLine = (n*2)-1; // middle line
            for(int x = (n-1); x >= 1; x--) {
                newLine = ((x*2)-1)*2;  // *2 because I have the upside
                total = total + newLine;
            }
            total = total + biggestLine;
        }
        return total;
    }
}
