package com.soft9000.M1000.A00900;

import com.soft9000.M1000.A00901.Nexus;

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
