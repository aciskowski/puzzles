package org.example;

import java.util.HashMap;

public class PioterSolution {

    public static boolean checkString(String value) {
        if (value.length() % 2 == 1 || value.length() < 2) {
            return false;
        }

        HashMap<String, String> bracketsHashMap = getBracketsHashMap();

        int length = value.length() / 2;
        for (int i = 0; i < length; i++) {
            if (length == 1 && reversedBracketIsCorrect(bracketsHashMap, value.charAt(i), value.charAt(i + 1))) {
                return true;
            }

            reversedBracketIsCorrect(bracketsHashMap, value.charAt(i), value.charAt(value.length() - i - 1));
        }

        return true;
    }

    private static HashMap<String, String> getBracketsHashMap() {
        HashMap<String, String> brackets = new HashMap<>();
        brackets.put("{", "}");
        brackets.put("[", "]");
        brackets.put("(", ")");

        return brackets;
    }

    private static boolean reversedBracketIsCorrect(HashMap<String, String> bracketsHashMap, char charA, char charB) {
        String reversedBracket = bracketsHashMap.get(String.valueOf(charA));

        return charB == reversedBracket.charAt(0);
    }
}
