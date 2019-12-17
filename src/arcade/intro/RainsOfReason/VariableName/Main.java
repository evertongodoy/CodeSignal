package arcade.intro.RainsOfReason.VariableName;

import java.util.function.BooleanSupplier;

import java.util.regex.*;

public class Main {

    public static void main(String[] args){


        System.out.println(variableName("£_123"));

    }

    static boolean variableName(String name) {

        Pattern pattern;
        Matcher matcher;

        // Here I am going to define an Regular Expression
        String regex = "[a-zA-Z$_][a-zA-Z0-9$_]*";

        // And I ll compile this Regular Expression
        pattern = Pattern.compile(regex);

        // Verifying if the name is valid when we apply this RegEx
        matcher = pattern.matcher(name);

        return matcher.matches();

    }



}
