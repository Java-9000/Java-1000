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

    public static boolean Parse(String line, int precision, CalcJob job) {
        if (line == null) return false;
        if (Parse(line, job)) {
            job._btotal = job._btotal.setScale(precision, RoundingMode.HALF_UP);
            return true;
        }
        return false;
    }

    public static boolean Parse(String line, CalcJob job) {
        boolean result = false;
        if (line == null) return false;
        String[] values = line.split(" ");
        for (String value : values) {
            if (value == null || value.length() == 0) {
                if (job._btotal == null)
                    job._btotal = BigDecimal.valueOf(0D);
                continue;
            }
            char cval = value.charAt(0);
            switch (cval) {
                case '+': {
                    result = Nexus.add(job);
                    job._stack.clear();
                }
                break;
                case '-': {
                    result = Nexus.subtract(job);
                    job._stack.clear();
                }
                break;
                case '*': {
                    result = Nexus.multiply(job);
                    job._stack.clear();
                }
                break;
                case '/': {
                    result = Nexus.divide(job);
                    job._stack.clear();
                }
                break;
                default: {
                    if (Nexus.tryBigD(value) != null)
                        result = job._stack.add(value);
                    else
                        System.err.printf("Error: '%s' ?\n", value);
                }
            }
        }
        return result;
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

    public static boolean add(CalcJob job) {
        if (job == null) return false;
        for (String line : job._stack) {
            BigDecimal effort = tryBigD(line);
            if (effort != null) {
                if (job._btotal == null) {
                    job._btotal = effort;
                    continue;
                }
                try {
                    job._btotal = job._btotal.add(effort);
                } catch (Exception ex) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean subtract(CalcJob job) {
        if (job == null) return false;
        for (String line : job._stack) {
            BigDecimal effort = tryBigD(line);
            if (effort != null) {
                if (job._btotal == null) {
                    job._btotal = effort;
                    continue;
                }
                try {
                    job._btotal = job._btotal.subtract(effort);
                } catch (Exception ex) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean multiply(CalcJob job) {
        if (job == null) return false;
        for (String line : job._stack) {
            BigDecimal effort = tryBigD(line);
            if (effort != null) {
                if (job._btotal == null) {
                    job._btotal = effort;
                    continue;
                }
                try {
                    job._btotal = job._btotal.multiply(effort);
                } catch (Exception ex) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean divide(CalcJob job) {
        if (job == null) return false;
        for (String line : job._stack) {
            BigDecimal effort = tryBigD(line);
            if (effort != null) {
                if (job._btotal == null) {
                    job._btotal = effort;
                    continue;
                }
                try {
                    job._btotal = job._btotal.divide(effort);
                } catch (Exception ex) {
                    return false;
                }
            }
        }
        return true;
    }
}
