package com.soft9000.M1000.A01000;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
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
        assertNull(Nexus.Parse(null));
        assertEquals(0.0D, Nexus.Parse("").doubleValue());
        BigDecimal bd = Nexus.Parse("1 2 3 4 5 +");
        assertNotNull(bd);
        assertEquals(15, bd.intValue());
        bd = Nexus.Parse("1 2 3 4 5 + 1 2 3 4 -");
        assertNotNull(bd);
        assertEquals(5, bd.intValue());
    }

    @Test
    void testParsePrecision() {
        assertNull(Nexus.Parse(null, 0));
        assertEquals(0D, Nexus.Parse("", 0).doubleValue());
        BigDecimal bd = Nexus.Parse("1.556 2.556 3.556 4.556 5.556 +", 1);
        assertNotNull(bd);
        assertEquals(17.8D, bd.doubleValue());
        bd = Nexus.Parse("1 2 3 4 5 + 0.556 -5 *", 4);
        assertNotNull(bd);
        assertEquals(14.444D, bd.doubleValue());
    }

    @Test
    void tryBigD() {
        assertNull(Nexus.tryBigD(null));
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
        assertEquals(0, Nexus.add(null, null).intValue());
        BigDecimal big = BigDecimal.valueOf(5);
        ArrayList<String> params = new ArrayList<>();
        params.add("5");
        params.add(null);
        params.add("5");
        big = Nexus.add(params, big);
        assertEquals(15, big.intValue());
    }

    @Test
    void subtract() {
        assertEquals(0, Nexus.subtract(null, null).intValue());
        BigDecimal big = BigDecimal.valueOf(125);
        ArrayList<String> params = new ArrayList<>();
        params.add(null);
        params.add("5");
        params.add(null);
        params.add("5");
        params.add(null);
        big = Nexus.subtract(params, big);
        assertEquals(115, big.intValue());
    }

    @Test
    void multiply() {
        assertEquals(0, Nexus.multiply(null, null).intValue());
        BigDecimal big = BigDecimal.valueOf(5);
        ArrayList<String> params = new ArrayList<>();
        params.add("5");
        params.add(null);
        params.add("5");
        big = Nexus.multiply(params, big);
        assertEquals(125, big.intValue());
    }

    @Test
    void divide() {
        assertEquals(0, Nexus.divide(null, null).intValue());
        BigDecimal big = BigDecimal.valueOf(125);
        ArrayList<String> params = new ArrayList<>();
        params.add("5");
        params.add(null);
        params.add("5");
        big = Nexus.divide(params, big);
        assertEquals(5, big.intValue());
    }
}