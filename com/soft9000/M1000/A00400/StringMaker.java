package com.soft9000.M1000.A00400;

public class StringMaker {
    /**
     * Combine an array of strings together. Spaces will also be added.
     * @param data The string(s) to combine.
     * @param result The place to hold the combination.
     */
    private static void add(String[] data, StringBuilder result) {
        for (String dat : data) {
            result.append(dat);
            result.append(' ');
        }
        result.append("\n"); // NEW!
    }

    /**
     * Combine the input-parameters together.
     * @param args Input parameters.
     */
    public static void main(String[] args) {
        StringBuilder results = new StringBuilder();
        if(args == null || args.length < 1) {
            results.append("I've nothing to do?");
        } else {
            add(args, results);
        }
        System.out.println(results);
    }
}
