package arcade.intro.JourneyBegins.checkPalindrome;

public class Main {

    public static void main(String[] args){
        if(checkPalindrome("ovo")){
            System.out.println("SIM");
        } else {
            System.out.println("NAO");
        }
    }

    static boolean checkPalindrome(String inputString) {

        for(int i = 0, j = inputString.length() - 1; i < inputString.length() / 2; i++, j--) {
            if(inputString.charAt(i) != inputString.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
