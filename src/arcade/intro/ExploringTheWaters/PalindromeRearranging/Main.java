package arcade.intro.ExploringTheWaters.PalindromeRearranging;

import java.util.HashMap;
import java.util.Map;


public class Main {


    public static void main(String[] args){
        String text = "zyyzzzzz";
        System.out.println(palindromeRearranging(text));
    }

    static boolean palindromeRearranging(String inputString) {
        // Creates Map
        Map<String,Integer> mapKV = new HashMap<String,Integer>();

        // Removing duplicates characteres
        StringBuilder sb = new StringBuilder();
        inputString.chars().distinct().forEach(c -> sb.append((char) c));

        String strEnd = sb.substring(0, sb.length());

        // Creates array of char non duplicate
        char[] vetStr = strEnd.toCharArray();

        // Populate Map
        for(char c : vetStr) {
            int total = 0;
            for(int i = 0; i < inputString.length(); i++) {
                if(c == inputString.charAt(i)) {
                    total+=1;
                }
            }
            mapKV.put(String.valueOf(c), total);
        }


        int oddTotal = 0;
        for(char c : vetStr) {

            if(mapKV.get(String.valueOf(c)) %2 != 0) {
                oddTotal+=1;
            }

        }

        if(inputString.length() %2 == 0 && oddTotal > 0) {
            return Boolean.FALSE;
        } else if(inputString.length() %2 == 1 && oddTotal > 1) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;

    }

}

