package com.soft9000.M1000.A00800;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class WordProblemTest {

    @Test
    public void addNums() throws FileNotFoundException {
        URL url = this.getClass().getResource("WpTest001.txt");
        String afile = url.toString().substring(6);
        File file = new File(afile);
        Scanner scn = new Scanner(file);
        String result = WordProblem.addNums(scn);
        assertEquals(result,"itotal = 5 ftotal = 14.299999 SIGMA = 19.299999237060547");
    }
}