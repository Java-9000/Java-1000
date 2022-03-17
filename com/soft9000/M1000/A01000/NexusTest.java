package com.soft9000.M1000.A01000;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class NexusTest {

    @Test
    void getScanner() {
        Scanner scn = Nexus.getScanner();
        assertNotNull(scn);
        scn = Nexus.getScanner("This");
        assertEquals("This", scn.next());
    }

    @Test
    void parse() {
    }

    @Test
    void testParse() {
    }

    @Test
    void tryBigD() {
    }

    @Test
    void add() {
    }

    @Test
    void subtract() {
    }

    @Test
    void multiply() {
    }

    @Test
    void divide() {
    }
}