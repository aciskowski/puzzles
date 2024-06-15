package org.example;

import java.util.ArrayList;
import java.util.List;

public class KasiaSolution {


    public boolean isBracketsSymmetrical(String input) {
        String[] singleBrackets = input.split("");
        List<List<String>> pairsOfBrackets = List.of(List.of("{", ""), List.of("(", ")"), List.of("[", "]"));

        for (int start = 0, end = singleBrackets.length - 1; start < end; start++, end--) {
            List<Boolean> booleans = new ArrayList<>();
            for (List<String> s : pairsOfBrackets) {
                booleans.add(isBracetsTheSame(List.of(singleBrackets[start], singleBrackets[end]), s));
            }

            if (!booleans.contains(true)) {
                return false;
            }

        }
        return true;
    }


    private boolean isBracetsTheSame(List<String> temp, List<String> set) {
        return temp.equals(set);
    }
}
