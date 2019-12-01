package arcade.intro.SmoothSailing.CommonCharacter;

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        System.out.println(commonCharacterCount("aabcc","adcaa"));

    }

    static int commonCharacterCount(String s1, String s2) {

        // Lista dos caracteres
        List<Character> lstS1 = new ArrayList<Character>();
        for(int x = 0; x < s1.length(); x++) {
            lstS1.add(s1.charAt(x));
        }

        List<Character> lstS2 = new ArrayList<Character>();
        for(int y = 0; y < s2.length(); y++) {
            lstS2.add(s2.charAt(y));
        }

        if(s1.length() >= s2.length()) {
            for(int x = 0; x < lstS1.size(); x++) {
                for(int y = 0; y <lstS2.size(); y++) {
                    if(lstS2.get(y).equals(lstS1.get(x))) {
                        lstS1.remove(x);
                        lstS2.remove(y);
                        x--;
                        break;
                    }
                }
            }
            return s1.length() - lstS1.size();
        } else {
            for(int x = 0; x < lstS2.size(); x++) {
                for(int y = 0; y <lstS1.size(); y++) {
                    if(lstS1.get(y).equals(lstS2.get(x))) {
                        lstS2.remove(x);
                        lstS1.remove(y);
                        x--;
                        break;
                    }
                }
            }
            return s2.length() - lstS2.size();
        }


    }


}
