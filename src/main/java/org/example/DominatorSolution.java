package org.example;

import java.util.ArrayList;
import java.util.List;

public class DominatorSolution {

    public static void testIfBothBracketsAreSymetricalClose(String text) {
        List<String> result = new ArrayList<String>();//typ domyslny, nie trzeba wpisywac String w ArrayList, po za tym lista rezultato nie potrzebna, ma zwracac tylko true jesli CALY string jest poprawny i false jesli nie
        StringBuilder actuallyText = new StringBuilder(text);
        if (text.length() % 2 > 0) {// ==1 pewnie lepiej, ale sie nei czepiam
            result.add("false");//return false
        } else {
            while (actuallyText.length() > 0) {
                if (isMatchingPair(actuallyText.charAt(0), actuallyText.charAt(actuallyText.length() - 1))) {
                    actuallyText.deleteCharAt(0);
                    actuallyText.deleteCharAt(actuallyText.length() - 1);
                    result.add("true");//nie potrzebne
                } else if (!isMatchingPair(actuallyText.charAt(0),
                        actuallyText.charAt(actuallyText.length() - 1))) {//po prostu else
                    result.add("false");//return false
                    break;//nie potrzebne
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
        //dla calego bloku powyzej po prostu return i warunek w ifie
    }

}
