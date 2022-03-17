package com.soft9000.M1000.A01000;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class ClassyCalc {

    public static void main(String[] args) {
        System.out.println("~~~ RPN Calculator ~~~");
        System.out.println("Example:\n1 2 3 4 5 [+,-,*,/]");
        System.out.println("Enter EOF when done:");
        Scanner scn = Nexus.getScanner(args); // NEW!
        while (scn.hasNext()) {
            String line = scn.nextLine();
            if (line.toLowerCase(Locale.ROOT).equals("eof"))
                break;
            BigDecimal result = Nexus.Parse(line);
            System.out.println("= " + result);
        }
        System.out.println("Done.");
    }

}
