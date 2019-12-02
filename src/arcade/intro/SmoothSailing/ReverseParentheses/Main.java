package arcade.intro.SmoothSailing.ReverseParentheses;

public class Main {

    public static void main(String[] args){
        String input = "foo(bar(baz))blim";
        System.out.println(reverseInParentheses(input));
    }

    static String reverseInParentheses(String inputString) {

        String aux = "";

        while(hasParenthesis(inputString)) {

            int posLastParenthesis = lastParenthesis(inputString);
            int posFirstParenthesisAfterLast = firstParenthesisAfterLast(inputString, posLastParenthesis);

            System.out.println("Last position = " + posLastParenthesis);
            System.out.println("First position = " + posFirstParenthesisAfterLast);

            String momentaneousStr = inputString.substring(posLastParenthesis+1, posFirstParenthesisAfterLast);
            String momentaneousStrInv = "";

            System.out.println(momentaneousStr);

            for(int j = momentaneousStr.length()- 1; j >= 0; j--) {
                momentaneousStrInv = momentaneousStrInv + String.valueOf(momentaneousStr.charAt(j));
            }

            System.out.println(momentaneousStrInv);

            // new input String
            aux = "";
            for(int i = 0; i < inputString.length(); i++) {
                if(i != posLastParenthesis && i != posFirstParenthesisAfterLast) {
                    aux = aux + String.valueOf(inputString.charAt(i));
                } else {
                    aux = aux + momentaneousStrInv;
                    i = posFirstParenthesisAfterLast;
                }
            }
            inputString = aux;
        }


        return inputString;
    }

    // Verifying if exists parenthesis
    static public Boolean hasParenthesis(String inputString) {
        for(int i=0; i < inputString.length(); i++) {
            //System.out.print(inputString.charAt(i));
            if(inputString.charAt(i) == '(') {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    static public int lastParenthesis(String inputString) {
        int posLastParenthesis = 0;
        for(int i=0; i < inputString.length(); i++) {
            //System.out.print(inputString.charAt(i));
            if(inputString.charAt(i) == '(') {
                posLastParenthesis = i;
            }
        }
        return posLastParenthesis;
    }

    static public int firstParenthesisAfterLast(String inputString, int posLastParenthesis) {
        int posFirstParenthesisAfterLast = 0;

        for(int i=posLastParenthesis; i < inputString.length(); i++) {
            if(inputString.charAt(i) == ')') {
                posFirstParenthesisAfterLast = i;
                break;
            }
        }

        return posFirstParenthesisAfterLast;
    }

}
