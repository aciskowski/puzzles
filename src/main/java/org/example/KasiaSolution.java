package org.example;

import java.util.ArrayList;
import java.util.List;

public class KasiaSolution {


    public static boolean isBracketsSymmetrical(String input) {
        String[] singleBrackets = input.split("");
        List<List<String>> pairsOfBrackets = List.of(List.of("{", "}"), List.of("(", ")"), List.of("[", "]"));//pewnie bym zmienil strukure na bardziej czytelna tutaj

        for (int start = 0, end = singleBrackets.length - 1; start < end; start++, end--) {//ogolnie bedzie w pizdziec iteracji ze wzgledu na liczbe list do przejscia
            List<Boolean> booleans = new ArrayList<>();
            for (List<String> s : pairsOfBrackets) {
                booleans.add(isBracetsTheSame(List.of(singleBrackets[start], singleBrackets[end]), s));
            }

            if (!booleans.contains(true)) {//return !booleans.contains(true) zamiast tego ifa
                return false;
            }

        }
        return true;
    }


    private static boolean isBracetsTheSame(List<String> temp, List<String> set) {
        return temp.equals(set);
    }
}
