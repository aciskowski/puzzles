package org.example;

import java.util.ArrayList;
import java.util.List;

public class DominatorSolution {

    public static void testIfBothBracketsAreSymetricalClose(String text) {
        List<String> result = new ArrayList<String>();
        StringBuilder actuallyText = new StringBuilder(text);
        if (text.length() % 2 > 0) {
            result.add("false");
        } else {
            while (actuallyText.length() > 0) {
                if (isMatchingPair(actuallyText.charAt(0), actuallyText.charAt(actuallyText.length() - 1))) {
                    actuallyText.deleteCharAt(0);
                    actuallyText.deleteCharAt(actuallyText.length() - 1);
                    result.add("true");
                } else if (!isMatchingPair(actuallyText.charAt(0),
                        actuallyText.charAt(actuallyText.length() - 1))) {
                    result.add("false");
                    break;
                }
            }
        }
        System.out.print(result);
    }

    private static boolean isMatchingPair(char opening, char closing) {
        if ((opening == '(' && closing == ')') ||
                (opening == '|' && closing == '|') ||
                (opening == '[' && closing == ']') ||
                (opening == '{' && closing == '}'))
            return true;
        else {
            return false;
        }
    }

}
