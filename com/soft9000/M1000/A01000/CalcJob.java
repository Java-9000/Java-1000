package com.soft9000.M1000.A01000;

import java.math.BigDecimal;
import java.util.ArrayList;

public class CalcJob {
    ArrayList<String> _stack = new ArrayList<>();
    BigDecimal _btotal = null;

    public void reset() {
        _btotal = null;
        _stack.clear();
    }

    public BigDecimal getTotal() {
        if (_btotal == null) {
            return BigDecimal.valueOf(0);
        }
        return _btotal;
    }
}
