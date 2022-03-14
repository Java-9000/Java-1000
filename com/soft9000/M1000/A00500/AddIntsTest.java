package com.soft9000.M1000.A00500;

import org.junit.Assert;
import org.junit.Test;

public class AddIntsTest {

    @Test
    public void add() {
        String expr = AddInts.add(1, 2, 3, 4, 5);
        Assert.assertEquals(expr, "1+2+3+4+5=15");
        expr = AddInts.add(1, 2, 3, 4, -5);
        Assert.assertEquals(expr, "1+2+3+4+-5=5");
    }
}