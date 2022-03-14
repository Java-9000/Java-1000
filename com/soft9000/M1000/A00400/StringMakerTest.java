package com.soft9000.M1000.A00400;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class StringMakerTest {

    @Test
    public void main() {
        ByteArrayOutputStream my_out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(my_out));
        StringMaker.main(null);
        StringMaker.main(new String[0]);
        String[] params = {"this","is a","test!"};
        StringMaker.main(params);
        String[] results = my_out.toString().trim().split("\n");
        String[] expected = {
                "I've nothing to do?",
                "I've nothing to do?",
                "this is a test!",
        };
        Assert.assertEquals(results.length, expected.length);
        for (int ss = 0; ss < expected.length; ss++) {
            Assert.assertEquals(results[ss].trim(), expected[ss]);
        }
        System.setOut(System.err);
        System.out.println("Testing Success!");
    }
}