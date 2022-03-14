package com.soft9000.M1000.A00700;

import java.math.BigDecimal;

public class BigD {

    public static BigDecimal add(BigDecimal result, Double... vals) {
        if (vals != null)
            for (Double val : vals) {
                if (val == null) continue;
                result = result.add(BigDecimal.valueOf(val));
            }
        return result;
    }

    public static BigDecimal sub(BigDecimal result, Double... vals) {
        if (vals != null)
            for (Double val : vals) {
                if (val == null) continue;
                result = result.subtract(BigDecimal.valueOf(val));
            }
        return result;
    }

    public static BigDecimal mul(BigDecimal result, Double... vals) {
        if (vals != null)
            for (Double val : vals) {
                if (val == null) continue;
                result = result.multiply(BigDecimal.valueOf(val));
            }
        return result;
    }

    public static BigDecimal div(BigDecimal result, Double... vals) {
        if (vals != null)
            for (Double val : vals) {
                if (val == null) continue;
                result = result.divide(BigDecimal.valueOf(val));
            }
        return result;
    }
}
