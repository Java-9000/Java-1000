package com.soft9000.M1000.A00200;

public class MainParam {

    public static void main(String[] args) {
        if (args == null) {
            System.out.println("Input parameters are null.");
            return;
        }
        if (args.length == 0) {
            System.out.println("I've nada to heco?");
            return;
        }
        if (args.length != 0) {
            System.out.println("I've " + args.length + " parameter strings.");
        }
        // The return is implied, here!
    }
}
