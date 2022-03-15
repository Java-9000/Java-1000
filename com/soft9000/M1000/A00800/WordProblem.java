package com.soft9000.M1000.A00800;

import java.math.BigDecimal;
import java.util.Scanner;

public class WordProblem {

    public static Integer tryInt(String value) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public static Float tryFloat(String value) {
        try {
            return Float.parseFloat(value);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public static Double tryDouble(String value) {
        try {
            return Double.parseDouble(value);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public static String addNums(Scanner scn) {
        StringBuilder sb = new StringBuilder();
        int itotal = 0;
        float ftotal = 0F;
        double dtotal = 0D;
        while (scn.hasNext()) {
            String value = scn.next();
            Integer ivalue = tryInt(value);
            if (ivalue != null) {
                itotal += ivalue;
                continue;
            }
            Float fvalue = tryFloat(value);
            if (fvalue != null) {
                ftotal += fvalue;
                continue;
            }
            Double dvalue = tryDouble(value);
            if (dvalue != null) {
                dtotal += dvalue;
                continue;
            }
        }
        if (itotal != 0) {
            sb.append(" itotal = " + itotal);
        }
        if (ftotal != 0F) {
            sb.append(" ftotal = " + ftotal);
        }
        if (dtotal != 0D) {
            sb.append(" dtotal = " + dtotal);
        }
        sb.append(" SIGMA = " + BigDecimal.valueOf(itotal + ftotal + dtotal));
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println("Enter ^D (CTRL+d) when done:");
        Scanner scn = new Scanner(System.in);
        System.out.println(addNums(scn));
    }
}
