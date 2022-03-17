package com.soft9000.M1000.A00901;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

/**
 * Mission: Collect our re-use into one place. The idea is to
 * minimize student overloading 8^) whilst we reach a
 * critical-mass on any testable sub-theme.
 */
public class Nexus {

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
