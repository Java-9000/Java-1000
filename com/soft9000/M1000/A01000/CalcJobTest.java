package com.soft9000.M1000.A01000;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CalcJobTest {

    public void defaultStateAssert(CalcJob job) {
        assertNull(job._btotal);
        assertNotNull(job._stack);
        assertEquals(0, job._stack.size());
        assertEquals(0D, job.getTotal().doubleValue());
    }

    @Test
    void testReset() {
        CalcJob job = new CalcJob();
        defaultStateAssert(job);
        job._btotal = BigDecimal.valueOf(123);
        job.reset();
        defaultStateAssert(job);
        job._stack.add("boomer");
        assertEquals(1, job.getStack().size());
        job.reset();
        defaultStateAssert(job);
        job.setTotal(BigDecimal.valueOf(123));
        assertFalse(job.addParam("boomer"));
        job.reset();
        defaultStateAssert(job);
    }

    @Test
    void testGetTotal() {
        setTotal();
    }

    @Test
    void setTotal() {
        CalcJob job = new CalcJob();
        var aval = 123.345;
        BigDecimal bdval = BigDecimal.valueOf(aval);
        job.setTotal(bdval);
        BigDecimal bd = job.getTotal();
        assertEquals(bdval, bd);
    }

    @Test
    void addParam() {
        CalcJob job = new CalcJob();
        assertFalse(job.addParam("boomer"));
        getStack();
    }

    @Test
    void getStack() {
        CalcJob job = new CalcJob();
        assertTrue(job.addParam("5"));
        assertEquals(1, job.getStack().size());
        assertTrue(job.addParam("+"));
        assertEquals(2, job.getStack().size());
        assertTrue(job.addParam("-"));
        assertTrue(job.addParam("*"));
        assertTrue(job.addParam("/"));
        assertEquals(5, job.getStack().size());
        job.reset();
        defaultStateAssert(job);
    }
}
