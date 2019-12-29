package arcade.intro.RainsOfReason.alphabeticShift;

public class Main {

    public static void main(String[] args){

        String text = "fuzzy";

        System.out.println(alphabeticShift(text));

    }


    static String alphabeticShift(String inputString) {

        String ret = "";
        int valueSum;

        for(char ch : inputString.toCharArray()){
            valueSum = 1;

            if(ch == 'z'){
                ch = 'a';
                valueSum = 0;
            }

            if (ch == 'Z') {
                ch = 'A';
                valueSum = 0;
            }

            int num = valueSum + ( (int)ch );
            ret += (char) num;
        }
        return ret;
    }


}