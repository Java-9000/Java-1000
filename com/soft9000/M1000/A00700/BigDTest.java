package com.soft9000.M1000.A00700;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class BigDTest {

    // Factory Pattern:
    private final BigDecimal bd = BigDecimal.valueOf(1D);

    @Test
    public void add() {
        BigDecimal result = BigD.add(bd, 1.1D, 2.2D, 3.3D, 4.4D, 5.5D);
        assertEquals(17.5D, result.doubleValue(), 0.0);
        assertEquals(17.5F, result.floatValue(), 0.0);
        assertEquals(17, result.intValue(), 0.0);
        assertEquals(.5F, result.remainder(result).floatValue(), 0.6); // Note
    }

    @Test
    public void sub() {
        BigDecimal result = BigD.sub(bd, 1.1D, 2.2D, 3.3D, 4.4D, 5.5D);
        assertEquals(-15.5D, result.doubleValue(), 0.0);
        assertEquals(-15.5F, result.floatValue(), 0.0);
        assertEquals(-15, result.intValue(), 0.0);
        assertEquals(-.5F, result.remainder(result).floatValue(), 0.5); // Note
        assertEquals(0F, result.remainder(result).floatValue(), 0.4); // Notice!
    }

    @Test
    public void mul() {
        BigDecimal result = BigD.mul(bd, 1.1D, 2.2D, 3.3D, 4.4D, 5.5D);
        assertEquals(193.2612D, result.doubleValue(), 0.0);
        assertEquals(193.2612F, result.floatValue(), 0.0);
        assertEquals(193, result.intValue(), 0.0);
    }


    @Test
    public void div() {
        BigDecimal add = bd.add(BigDecimal.valueOf(200));
        BigDecimal result = BigD.div(add, 5D);
        assertEquals(40.2D, result.doubleValue(), 0.0);
        assertEquals(40.2F, result.floatValue(), 0.0);
        assertEquals(40, result.intValue(), 0.0);
    }
}