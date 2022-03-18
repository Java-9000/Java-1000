package com.soft9000.M1000.A01000;

import java.util.Locale;
import java.util.Scanner;

public class ClassyCalc {

    public static void main(String[] args) {
        System.out.println("~~~ RPN Calculator ~~~");
        System.out.println("Example:\n1 2 3 4 5 [+,-,*,/]");
        System.out.println("Enter EOF when done:");
        Scanner scn = Nexus.getScanner(args); // NEW!
        CalcJob job = new CalcJob();
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
