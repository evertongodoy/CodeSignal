package arcade.intro.RainsOfReason.EvenDigitsOnly;

public class Main {

    public static void main(String[] args){

        int n = 2462487;
        System.out.println(evenDigitsOnly(n));
    }

    static boolean evenDigitsOnly(int n) {

        for(char c : String.valueOf(n).toCharArray()) {
            if(Character.getNumericValue(c) %2 != 0  ) return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

}
