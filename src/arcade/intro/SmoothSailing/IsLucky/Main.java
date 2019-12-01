package arcade.intro.SmoothSailing.IsLucky;

public class Main {

    public static void main(String[] args){
        if(isLucky(239017)){
            System.out.println("true");
        } else{
            System.out.println("false");
        }
    }

    static boolean isLucky(int n) {
        String num = String.valueOf(n);

        int firstSum = 0;
        int secondSum = 0;

        for(int x = 0; x < num.substring(0, String.valueOf(n).length()/2).length(); x++) {
            firstSum = firstSum + Character.getNumericValue(num.substring(0, String.valueOf(n).length()/2).charAt(x));
        }

        for(int y = 0; y < num.substring(String.valueOf(n).length()/2, num.length()).length(); y++) {
            secondSum = secondSum + Character.getNumericValue(num.substring(String.valueOf(n).length()/2, num.length()).charAt(y));
        }

        if(firstSum == secondSum) {
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }
}
