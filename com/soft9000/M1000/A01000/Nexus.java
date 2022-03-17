package com.soft9000.M1000.A01000;

// Note: Copying source code from project-to-project is
// considered an extremely bad idea... To understand why,
// just 'Google `Y2K`?
//
// Once our Nexus stops gowing, then importation is a much
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

    protected static Scanner getScanner(String... params) {
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
        BigDecimal btotal = Parse(line);
        return btotal.setScale(precision, RoundingMode.HALF_UP);
    }

    public static BigDecimal Parse(String line) {
        ArrayList<String> stack = new ArrayList<>(); // NEW!
        BigDecimal btotal = null; // NEW! Tell others that we're 1st timein' ...

        String[] values = line.split(" ");
        for (String value : values) {
            if(value == null || value.length() == 0)
                continue;
            char cval = value.charAt(0);
            switch (cval) {
                case '+': {
                    btotal = com.soft9000.M1000.A00900.Nexus.add(stack, btotal);
                    stack.clear();
                }
                break;
                case '-': {
                    btotal = com.soft9000.M1000.A00900.Nexus.subtract(stack, btotal);
                    stack.clear();
                }
                break;
                case '*': {
                    btotal = com.soft9000.M1000.A00900.Nexus.multiply(stack, btotal);
                    stack.clear();
                }
                break;
                case '/': {
                    btotal = com.soft9000.M1000.A00900.Nexus.divide(stack, btotal);
                    stack.clear();
                }
                break;
                default: {
                    if (com.soft9000.M1000.A00900.Nexus.tryBigD(value) != null)
                        stack.add(value);
                    else
                        System.err.printf("Error: '%s' ?\n", value); // NEW!
                }
            }
        }
        return btotal;
    }

    public static BigDecimal tryBigD(String... values) {
        for (String value : values) {
            try {
                Integer effort = Integer.parseInt(value);
                return BigDecimal.valueOf(effort);
            } catch (NumberFormatException e) {

            }
            try {
                Float effort = Float.parseFloat(value);
                return BigDecimal.valueOf(effort);
            } catch (NumberFormatException e) {

            }
            try {
                Double effort = Double.parseDouble(value);
                return BigDecimal.valueOf(effort);
            } catch (NumberFormatException e) {

            }

        }
        return null;
    }

    public static BigDecimal add(ArrayList<String> stack, BigDecimal btotal) {
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
                    return BigDecimal.valueOf(0); // NEW! (error)
                }
            }
        }
        return btotal;
    }

    public static BigDecimal subtract(ArrayList<String> stack, BigDecimal btotal) {
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
                    return BigDecimal.valueOf(0); // NEW! (error)
                }
            }
        }
        return btotal;
    }

    public static BigDecimal multiply(ArrayList<String> stack, BigDecimal btotal) {
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
                    return BigDecimal.valueOf(0); // NEW! (error)
                }
            }
        }
        return btotal;
    }

    public static BigDecimal divide(ArrayList<String> stack, BigDecimal btotal) {

            for (String line : stack) {
                BigDecimal effort = tryBigD(line);
                if (effort != null) {
                    if (btotal == null) {
                        btotal = effort;
                        continue;
                    }
                    try {
                        btotal = btotal.divide(effort);
                    } catch(Exception ex) {
                        return BigDecimal.valueOf(0); // NEW! (error)
                    }
                }
            }
        return btotal;
    }
}
