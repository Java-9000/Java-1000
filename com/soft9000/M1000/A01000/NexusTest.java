package com.soft9000.M1000.A01000;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class NexusTest {

    @Test
    void getScanner() {
        Scanner scn = Nexus.getScanner();
        assertNotNull(scn);
        scn = Nexus.getScanner("This");
        assertEquals("This", scn.next());
        scn = Nexus.getScanner("This", "isa", "tEst!");
        assertEquals("This isa tEst!", scn.nextLine());
    }

    @Test
    void testParse() {
        assertFalse(Nexus.Parse(null, null));
        CalcJob job = new CalcJob();
        assertNull(job._btotal);
        assertFalse(Nexus.Parse("", job));
        assertTrue(Nexus.Parse("1 2 3 4 5 +", job));
        assertNotNull(job._btotal);
        assertEquals(15, job._btotal.intValue());
        job.reset();
        assertNull(job._btotal);
        assertTrue(Nexus.Parse("1 2 3 4 5 + 1 2 3 4 -", job));
        assertNotNull(job._btotal);
        assertEquals(5, job._btotal.intValue());
    }

    @Test
    void testParsePrecision() {
        assertFalse(Nexus.Parse(null, 0, null));
        CalcJob job = new CalcJob();
        assertFalse(Nexus.Parse("", 0, job));
        job.reset();
        assertTrue(Nexus.Parse("1.556 2.556 3.556 4.556 5.556 +", 1, job));
        assertNotNull(job._btotal);
        assertEquals(17.8D, job._btotal.doubleValue());
        job.reset();
        assertTrue(Nexus.Parse("1 2 3 4 5 + 0.556 -5 *", 3, job));
        assertNotNull(job._btotal);
        assertEquals(14.444D, job._btotal.doubleValue());
    }

    @Test
    void tryBigD() {
        assertFalse(Nexus.subtract(null));
        CalcJob job = new CalcJob();
        assertNull(Nexus.tryBigD(""));
        assertEquals(BigDecimal.valueOf(1421), Nexus.tryBigD("1421"));
        assertEquals(BigDecimal.valueOf(1421.1234130859375D), Nexus.tryBigD("1421.12345D"));
        assertEquals(1421.1234D,
                Nexus.tryBigD("1421.12345D")
                        .setScale(4,
                                RoundingMode.HALF_UP).doubleValue());
    }

    @Test
    void add() {
        assertFalse(Nexus.add(null));
        CalcJob job = new CalcJob();
        job._btotal = BigDecimal.valueOf(5);
        job._stack.add("5");
        job._stack.add(null);
        job._stack.add("5");
        assertTrue(Nexus.add(job));
        assertEquals(15, job._btotal.intValue());
    }

    @Test
    void subtract() {
        assertFalse(Nexus.subtract(null));
        CalcJob job = new CalcJob();
        job._btotal = BigDecimal.valueOf(125);
        job._stack.add(null);
        job._stack.add("5");
        job._stack.add(null);
        job._stack.add("5");
        job._stack.add(null);
        assertTrue(Nexus.subtract(job));
        assertEquals(115, job._btotal.intValue());
    }

    @Test
    void multiply() {
        assertFalse(Nexus.multiply(null));
        CalcJob job = new CalcJob();
        job._btotal = BigDecimal.valueOf(5);
        job._stack.add("5");
        job._stack.add(null);
        job._stack.add("5");
        assertTrue(Nexus.multiply(job));
        assertEquals(125, job._btotal.intValue());
    }

    @Test
    void divide() {
        assertFalse(Nexus.subtract(null));
        CalcJob job = new CalcJob();
        job._btotal = BigDecimal.valueOf(125);
        job._stack.add("5");
        job._stack.add(null);
        job._stack.add("5");
        assertTrue(Nexus.divide(job));
        assertEquals(5, job._btotal.intValue());
    }
}