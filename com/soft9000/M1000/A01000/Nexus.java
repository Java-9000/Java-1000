package com.soft9000.M1000.A01000;

// Note: Copying source code from project-to-project is
// considered an extremely bad idea... To understand why,
// just 'Google `Y2K`?
//
// Once our Nexus stops growing, then importation is a much
// better way to share any fully-tested code between projects.
//

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Mission: Collect our re-use into one place. The idea is to
 * minimize student overloading 8^) whilst we reach a
 * critical-mass on any testable sub-theme.
 */
public class Nexus {

    /**
     * Convert a collection of strings into a Scanner. Use System.in
     * if none. Null input-strings will be ignored.
     *
     * @param params A collection of String.
     * @return A scanner from same, else the standard input.
     */
    public static Scanner getScanner(String... params) {
        if (params != null) {
            StringBuilder sb = new StringBuilder();
            for (String param : params) {
                if (param == null)
                    continue;
                sb.append(param);
                sb.append(" ");
            }
            return new Scanner(sb.toString().trim());
        }
        return new Scanner(System.in);
    }

    public static BigDecimal Parse(String line, int precision) {
        if (line == null) return null; // GIGO
        BigDecimal btotal = Parse(line);
        return btotal.setScale(precision, RoundingMode.HALF_UP);
    }

    public static BigDecimal Parse(String line) {
        if (line == null) return null; // GIGO
        ArrayList<String> stack = new ArrayList<>();
        BigDecimal btotal = null; // Tell others that we're 1st timein' ...

        String[] values = line.split(" ");
        for (String value : values) {
            if (value == null || value.length() == 0) {
                if (btotal == null)
                    btotal = BigDecimal.valueOf(0D);
                continue;
            }
            char cval = value.charAt(0);
            switch (cval) {
                case '+': {
                    btotal = Nexus.add(stack, btotal);
                    stack.clear();
                }
                break;
                case '-': {
                    btotal = Nexus.subtract(stack, btotal);
                    stack.clear();
                }
                break;
                case '*': {
                    btotal = Nexus.multiply(stack, btotal);
                    stack.clear();
                }
                break;
                case '/': {
                    btotal = Nexus.divide(stack, btotal);
                    stack.clear();
                }
                break;
                default: {
                    if (Nexus.tryBigD(value) != null)
                        stack.add(value);
                    else
                        System.err.printf("Error: '%s' ?\n", value);
                }
            }
        }
        return btotal;
    }

    /**
     * Attempt to parse any SINGLE value.
     *
     * @param value Any parsable value.
     * @return A BigDecimal, else null.
     */
     static BigDecimal tryBigD(String value) {
        if (value == null) return null; // GIGO
        try {
            var effort = Integer.parseInt(value);
            return BigDecimal.valueOf(effort);
        } catch (NumberFormatException e) {

        }
        try {
            var effort = Float.parseFloat(value);
            return BigDecimal.valueOf(effort);
        } catch (NumberFormatException e) {

        }
        try {
            var effort = Double.parseDouble(value);
            return BigDecimal.valueOf(effort);
        } catch (NumberFormatException e) {

        }
        return null;
    }

    public static BigDecimal add(ArrayList<String> stack, BigDecimal btotal) {
        if (stack == null) return BigDecimal.valueOf(0);
        for (String line : stack) {
            BigDecimal effort = tryBigD(line);
            if (effort != null) {
                if (btotal == null) {
                    btotal = effort;
                    continue;
                }
                try {
                    btotal = btotal.add(effort);
                } catch (Exception ex) {
                    return BigDecimal.valueOf(0);
                }
            }
        }
        return btotal;
    }

    public static BigDecimal subtract(ArrayList<String> stack, BigDecimal btotal) {
        if (stack == null) return BigDecimal.valueOf(0);
        for (String line : stack) {
            BigDecimal effort = tryBigD(line);
            if (effort != null) {
                if (btotal == null) {
                    btotal = effort;
                    continue;
                }
                try {
                    btotal = btotal.subtract(effort);
                } catch (Exception ex) {
                    return BigDecimal.valueOf(0);
                }
            }
        }
        return btotal;
    }

    public static BigDecimal multiply(ArrayList<String> stack, BigDecimal btotal) {
        if (stack == null) return BigDecimal.valueOf(0);
        for (String line : stack) {
            BigDecimal effort = tryBigD(line);
            if (effort != null) {
                if (btotal == null) {
                    btotal = effort;
                    continue;
                }
                try {
                    btotal = btotal.multiply(effort);
                } catch (Exception ex) {
                    return BigDecimal.valueOf(0);
                }
            }
        }
        return btotal;
    }

    public static BigDecimal divide(ArrayList<String> stack, BigDecimal btotal) {
        if (stack == null) return BigDecimal.valueOf(0);
        for (String line : stack) {
            BigDecimal effort = tryBigD(line);
            if (effort != null) {
                if (btotal == null) {
                    btotal = effort;
                    continue;
                }
                try {
                    btotal = btotal.divide(effort);
                } catch (Exception ex) {
                    return BigDecimal.valueOf(0);
                }
            }
        }
        return btotal;
    }
}
