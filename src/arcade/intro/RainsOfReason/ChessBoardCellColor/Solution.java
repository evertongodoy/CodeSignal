package arcade.intro.RainsOfReason.ChessBoardCellColor;

public class Solution {

    static boolean chessBoardCellColor(String cell1, String cell2) {
        int letraPosUm   = 0;
        int letraPosDois = 1;
        int numPosUm;
        int numPosDois;

        if(cell1.charAt(0) == 'A' || cell1.charAt(0) == 'C' || cell1.charAt(0) == 'E' || cell1.charAt(0) == 'G') {
            letraPosUm = 1;
        }
        if(cell2.charAt(0) == 'B' || cell2.charAt(0) == 'D' || cell2.charAt(0) == 'F' || cell2.charAt(0) == 'H') {
            letraPosDois = 0;
        }

        numPosUm = (cell1.charAt(1) %2 == 0)? 0 : 1;
        numPosDois = (cell2.charAt(1) %2 == 0)? 0 : 1;

        if((letraPosUm == letraPosDois) && (numPosUm == numPosDois)) {
            return true;
        } else if((letraPosUm != letraPosDois) && (numPosUm != numPosDois)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args){
        System.out.println(chessBoardCellColor("A1","C3"));
    }
}
