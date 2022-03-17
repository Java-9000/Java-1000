package com.soft9000.M1000.A00900;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class CalcRPN {

    public static void main(String[] args) {
        System.out.println("~~~ RPN Calculator ~~~");
        System.out.println("Example:\n1 2 3 4 5 [+,-,*,/]");
        System.out.println("Enter EOF when done:");
        Scanner scn = new Scanner(System.in);
        while (scn.hasNext()) {
            String line = scn.nextLine(); // NEW!
            if(line.toLowerCase(Locale.ROOT).equals("eof")) // NEW!
                break;
            BigDecimal result = Nexus.Parse(line);
            System.out.println("= " + result);
        }
        System.out.println("Done.");
    }
}
