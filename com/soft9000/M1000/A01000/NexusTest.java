package com.soft9000.M1000.A01000;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

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
    void testParse1() {
    }

    @Test
    void testParse2() {
    }

    @Test
    void tryBigD() {
    }

    @Test
    void add() {
        assertEquals(0, Nexus.add(null, null).intValue());
        BigDecimal big = BigDecimal.valueOf(5);
        ArrayList<String> params = new ArrayList<String>();
        params.add("5");
        params.add(null);
        params.add("5");
        big = Nexus.add(params, big);
        assertEquals(15, big.intValue());    }

    @Test
    void subtract() {
        assertEquals(0, Nexus.subtract(null, null).intValue());
        BigDecimal big = BigDecimal.valueOf(125);
        ArrayList<String> params = new ArrayList<String>();
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
        ArrayList<String> params = new ArrayList<String>();
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
        ArrayList<String> params = new ArrayList<String>();
        params.add("5");
        params.add(null);
        params.add("5");
        big = Nexus.divide(params, big);
        assertEquals(5, big.intValue());
    }
}