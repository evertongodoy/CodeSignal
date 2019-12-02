package arcade.intro.ExploringTheWaters.AddBorder;

public class Main {

    public static void main(String[] args){
        String[] array = {"abc", "ded"};
        for(String s : addBorder(array)){
            System.out.println(s);
        }
    }

    static String[] addBorder(String[] picture) {

        String[] strVetAux = new String[(picture.length)+2];

        // Create header and footer
        //  *****
        //  *abc*
        //  *****
        int size = picture[0].length()+2;
        String headFoot = "";
        int internalLoopCount = 0;

        for(int i = 0; i < size; i++) {
            headFoot += "*";
        }

        for(int i = 0; i < strVetAux.length; i++) {
            if(i == 0) {
                strVetAux[i] = headFoot;
            } else if(i == strVetAux.length-1) {
                strVetAux[i] = headFoot;
            } else {
                strVetAux[i] = "*" + picture[internalLoopCount] +"*";
                internalLoopCount++;
            }
        }

        return strVetAux;

    }
}
