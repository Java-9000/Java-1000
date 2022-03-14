package com.soft9000.M1000.A00600;

public class NullNasty {
    /**
     * The good news is that `primitive types` can be "boxed," or
     * surrounded by an instance of a class. The bad news is that
     * - unlike a primitive type - that a class instance may be null.
     * @param data A box full of float values?
     * @return An additive expression string.
     */
    public String add(Float[] data) {
        if(data == null) {
            return "Nada, Amig0!";
        }
        float[] big = new float[data.length];
        for(int ss = 0; ss < data.length; ss++) {
            // Possible:
            if(data[ss] == null)
                 big[ss] = 0;
            else
                big[ss] = data[ss];
        }
        return add(big);
    }

    /**
     * Return an additive string for `float`.
     * Demonstrate that primitive types cannot be null.
     * @param data An array of floating point values.
     * @return An additive expression string.
     */
    public String add(float[] data) {
        if(data == null) {
            return "Nada, Amig0!";
        }
        StringBuilder result = new StringBuilder();
        int total = 0;
        for (float dat : data) {
            if (result.length() != 0) {
                result.append('+');
            }
            result.append(dat);
            total += dat;
        }
        result.append("=");
        result.append(total);
        result.append('\n');
        return result.toString();
    }
}
