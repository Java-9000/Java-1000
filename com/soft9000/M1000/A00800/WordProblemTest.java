package com.soft9000.M1000.A00800;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;

import static org.junit.Assert.*;

public class WordProblemTest {

    @Test
    public void tryInt() {
        Integer boot = WordProblem.tryInt("0");
        assertNotNull(boot);
        assertEquals(boot.intValue(), 0);
        assertNull(WordProblem.tryInt("Boomer?"));
        Integer boop = WordProblem.tryInt("001234567");
        assertNotNull(boop);
        assertEquals(boop.intValue(), 1234567);
    }

    @Test
    public void tryFloat() {
        var boot = WordProblem.tryFloat("0");
        assertNotNull(boot);
        assertEquals(boot, 0F, 0.0F);
        assertNull(WordProblem.tryFloat("Boomer?"));
        var boop = WordProblem.tryFloat("00123.4567");
        assertNotNull(boop);
        assertEquals(boop, 123.4567F, 0.4);
    }

    @Test
    public void tryBigD() {
        var boot = WordProblem.tryBigD("0");
        assertNotNull(boot);
        assertEquals(boot.doubleValue(), 0F, 0.0F);
        assertNull(WordProblem.tryBigD("Boomer?"));
        var boop = WordProblem.tryBigD("00123.4567");
        assertNotNull(boop);
        assertEquals(boop.doubleValue(), 123.4567F, 0.4);
    }

    @Test
    public void tryDouble() {
        var boot = WordProblem.tryDouble("0");
        assertNotNull(boot);
        assertEquals(boot, 0F, 0.0F);
        assertNull(WordProblem.tryDouble("Boomer?"));
        var boop = WordProblem.tryDouble("00123.4567");
        assertNotNull(boop);
        assertEquals(boop, 123.4567F, 0.4);
    }

    @Test
    public void addNums() throws FileNotFoundException {
        URL url = this.getClass().getResource("WpTest001.txt");
        assertNotNull(url);
        String afile = url.toString().substring(6);
        File file = new File(afile);
        Scanner scn = new Scanner(file);
        String result = WordProblem.addNums(scn);
        // Yikes ... ?
        assertEquals("itotal = 5 ftotal = 14.299999 SIGMA = 514.2999990.0", result);
    }

    @Test
    public void addBigNums() throws FileNotFoundException {
        URL url = this.getClass().getResource("WpTest001.txt");
        assertNotNull(url);
        String afile = url.toString().substring(6);
        File file = new File(afile);
        Scanner scn = new Scanner(file);
        String result = WordProblem.addBigNums(scn, 2);
        // Better ... ?
        assertEquals("itotal = 5 btotal = 14.3 SIGMA = 19.30", result);
    }

}