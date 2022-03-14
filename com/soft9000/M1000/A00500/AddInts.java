package com.soft9000.M1000.A00500;

/**
 * Most Java classes neither have - nor need - a static main() member function...
 */
public class AddInts {
    /**
     * StringBuffer is a "drop in replacement" for StringBuilder
     * @param data Zero to many integral values.
     * @param result Where to show the calculation.
     */
    private static void add(int[] data, StringBuffer result) {
        int total = 0;
        for (int dat : data) {
            if (result.length() != 0) {
                result.append('+');
            }
            result.append(dat);
            total += dat;
        }
        result.append("=");
        result.append(total);
        result.append('\n');
    }

    /**
     * Functions can have the same name iff their input parameters are different. We call it "function overloading."
     * @param data Zero to many integral values.
     * @return The additive expression.
     */
    public static String add(int ... data) {
        // Unlike StringBuilder, a StringBuffer is "thread-safe":
        StringBuffer sb = new StringBuffer();
        add(data, sb);
        return sb.toString().trim();
    }

}
