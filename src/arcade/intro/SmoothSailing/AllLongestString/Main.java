package arcade.intro.SmoothSailing.AllLongestString;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        String[] array = {"aba", "aa", "ad", "vcd", "aba"};
        for(String arrayRet : allLongestStrings(array)){
            System.out.println(arrayRet);
        }

    }

    static String[] allLongestStrings(String[] inputArray) {

        List<String> lstBiggest = new ArrayList<String>();

        int biggestSize = 0;

        // Who is the biggest
        for(String s : inputArray){
            if(s.length() > biggestSize) {
                biggestSize = s.length();
            }
        }

        // Keep only the biggest values
        for(String s : inputArray){
            if(s.length() == biggestSize) {
                lstBiggest.add(s);
            }
        }

        // Final return
        String[] finalArrayStr = new String[lstBiggest.size()];

        for(int i = 0; i < lstBiggest.size(); i++) {
            finalArrayStr[i] = lstBiggest.get(i);
        }

        return finalArrayStr;

    }

}
