package com.soft9000.M1000.A00300;

public class StaticOps {
    /**
     * Combine an array of strings together. Spaces will also be added.
     * @param data The string(s) to combine.
     * @return The resulting space-delimited string.
     */
    private static String add(String[] data) {
        String result = ""; // One could also use a StringBuilder or a StringBuffer - Details later!
        for (String dat : data) {
            result += dat;
            result += ' '; // Yes, there is a better way to do this!
        }
        return result.trim();
    }

    /**
     * Combine the input-parameters together.
     * Note also how we can use either `String[]` or `String ...` to denote our input-array of values.
     * @param args Input parameters.
     */
    public static void main(String ... args) {
        String results;
        if(args == null || args.length < 1) {
            results = "I've nothing to do?";
        } else {
            results = add(args);
        }
        System.out.println(results);
    }

}
