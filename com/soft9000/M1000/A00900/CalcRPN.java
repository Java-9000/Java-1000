package com.soft9000.M1000.A00900;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class CalcRPN {

    public static BigDecimal Parse(String line, int precision) {
        BigDecimal btotal = Parse(line);
        return btotal.setScale(precision, RoundingMode.HALF_UP);
    }

    public static BigDecimal Parse(String line) {
        ArrayList<String> stack = new ArrayList<>(); // NEW!
        BigDecimal btotal = BigDecimal.valueOf(0D);

        String[] values = line.split(" ");
        for (String value : values) {
            char cval = value.charAt(0);
            switch (cval) {
                case '+': {
                    btotal = TryParsers.add(stack, btotal);
                    stack.clear();
                }
                break;
                case '-': {
                    btotal = TryParsers.subtract(stack, btotal);
                    stack.clear();
                }
                break;
                case '*': {
                    btotal = TryParsers.multiply(stack, btotal);
                    stack.clear();
                }
                break;
                case '/': {
                    btotal = TryParsers.divide(stack, btotal);
                    stack.clear();
                }
                break;
                default: {
                    if (TryParsers.tryBigD(value) != null)
                        stack.add(value);
                    else
                        System.err.printf("Error: '%s' ?\n", value); // NEW!
                }
            }
        }
        return btotal;
    }

    public static void main(String[] args) {
        System.out.println("~~~ RPN Calculator ~~~");
        System.out.println("Example:\n1 2 3 4 5 [+,-,*,/]");
        System.out.println("Enter EOF when done:");
        Scanner scn = new Scanner(System.in);
        while (scn.hasNext()) {
            String line = scn.nextLine(); // NEW!
            if(line.toLowerCase(Locale.ROOT).equals("eof")) // NEW!
                break;
            BigDecimal result = Parse(line);
            System.out.println("= " + result);
        }
        System.out.println("Done.");
    }
}
