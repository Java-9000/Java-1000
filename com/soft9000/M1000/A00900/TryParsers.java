package com.soft9000.M1000.A00900;

import java.math.BigDecimal;
import java.util.ArrayList;

public class TryParsers {

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
