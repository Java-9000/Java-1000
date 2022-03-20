package com.soft9000.M1000.A01100;

import java.util.Locale;
import java.util.Scanner;

public class CalcNester {
    public static void main(String[] args) {
        Nexus jobs = new Nexus(); // NEW - Required to create a NESTED CLASS!
        System.out.println("~~~ RPN Calculator ~~~");
        System.out.println("Example:\n1 2 3 4 5 [+,-,*,/]");
        System.out.println("Enter EOF when done:");
        Scanner scn = Nexus.getScanner(args); // Updated: Parent!
        Nexus.CalcJob job = jobs.getCalcJob(); // NEW - Access the NESTED CLASS!
        while (scn.hasNext()) {
            String line = scn.nextLine();
            if (line.toLowerCase(Locale.ROOT).equals("eof"))
                break;
            if (Nexus.Parse(line, job)) {
                System.out.println("= " + job.getTotal());
            } else {
                System.err.println("Try again ... ");
            }
            job.reset();
        }
        System.out.println("Done.");
    }

}
